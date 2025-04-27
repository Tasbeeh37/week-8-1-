// Constants for minimum and maximum team size
final int MIN_TEAM_SIZE = 2;
final int MAX_TEAM_SIZE = 5;

// Method to prompt for and return the number of students with input validation
int formGroups() {
int totalStudents;

// Use a do-while loop to repeatedly ask for input until it's valid
do {
System.out.println("How many students are in the group?");
totalStudents = input.nextInt();

// If the number of students is not positive, show error message
if (totalStudents <= 0) {
System.out.println("Error: total number of students must be positive");
}

// Continue prompting until a valid number of students is entered
} while (totalStudents <= 0);

return totalStudents; // Return the valid number of students
}

// Method to prompt for and return the team size with input validation
int enterTeamSize() {
int teamSize;

// Use a do-while loop to repeatedly ask for input until it's valid
do {
System.out.println("How many students should be in each team?");
teamSize = input.nextInt();

// If the team size is outside the valid range, show an error message
if (teamSize < MIN_TEAM_SIZE || teamSize > MAX_TEAM_SIZE) {
System.out.println("Error: team size must be between " + MIN_TEAM_SIZE + " and " + MAX_TEAM_SIZE);
}

// Continue prompting until a valid team size is entered
} while (teamSize < MIN_TEAM_SIZE || teamSize > MAX_TEAM_SIZE);

return teamSize; // Return the valid team size
}

// Method to calculate and display the number of teams and leftover students
void calculateNbTeams(int totalStudents, int teamSize) {
// Calculate the number of teams
int numberOfTeams = totalStudents / teamSize;

// Calculate how many students don't fit into the teams
int studentsLeft = totalStudents % teamSize;

// Display the results
System.out.println("There will be " + numberOfTeams + " teams");
System.out.println("There will be " + studentsLeft + " students who have no team");
}
