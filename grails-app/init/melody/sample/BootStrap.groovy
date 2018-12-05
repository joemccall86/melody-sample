package melody.sample

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        testFace()
    }

    def destroy = {
    }

    @Transactional
    void testFace() {
        new Face().save()
    }
}
