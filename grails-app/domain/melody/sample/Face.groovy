package melody.sample

class Face {

    static constraints = {
    }

    def afterInsert() {
        Face.withNewSession {
            log.debug "Face count = ${Face.count()}"
        }
    }
}
