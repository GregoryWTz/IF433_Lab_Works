package oop_109438_Gregorius.Week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR: Type mismatch

        if (user.email != null) {
            // SUCCESS via Smart Cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}