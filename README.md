# gym-management-JSwing
A Java application that utilizes the JSwing library to manage gym activities &amp; members. This resembles the final project submitted to Eng. Suzanne Al Hamwi in the Object Oriented Programming course at the Arab International University.

Database:
No database was used for this project. the closest resemblance to a database are the static ArrayLists stakeholders to store the info of all employees & clients and sports to store sport information.

Polymorphism:
despite polymorphism not being the best choice for this project, it was a requirement. To fullfil that, the static ArrayLists employees & clients were replaced by a single ArrayList in the superclass Stakeholder for the subclasses Client & Employee.
Function headers were also extracted to the superclass and then overridden in the subclasses to maintain functionality since this project was completed without using polymorphism, which was later added. Type casting was used where data was used only for reading/displaying purposes.

-Nour Habra
-Mustafa Alhasany
