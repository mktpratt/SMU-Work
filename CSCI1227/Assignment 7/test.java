    // Create the Student array and counter
    Student[] student = new Student[MAX_STU];
    int numStu = 0;
    String name;
    int asgn;
    int grade;

    // TODO: Get the students' data from a file specified by the user
    System.out.print("Which file should I use? ");
    String fileName = kbd.nextLine();

    File f = new File(fileName);
    try
    {
    Scanner gradesFile = new Scanner(f);

    for (int i = 0; i < MAX_STU; i++) 
    {
    while (!gradesFile.hasNextInt() && numStu < MAX_STU)
    {
    name = gradesFile.nextLine(); 
    student[numStu].setName(name);

    while(gradesFile.hasNextInt()) 
    {
    for(int s = 0; s < 6; s++)
    {
    grade = gradesFile.nextInt();
    asgn = 1;
    student[numStu].setAsgnGrade(asgn, grade);
    asgn ++;
    }
    } 
    }
    numStu ++; 
    }
    f.close();
    } 
    catch (FileNotFoundException e)
    {
    while (!f.exists())
    {
    System.out.print("File " + fileName + "could not be opened. "
    + "Please try again. ");
    fileName = kbd.nextLine(); 
    }
    }
