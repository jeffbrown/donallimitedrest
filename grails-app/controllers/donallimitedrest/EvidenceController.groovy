package donallimitedrest

class EvidenceController extends grails.rest.RestfulController<Evidence> {

    static allowedMethods = [save: "POST"]

    static responseFormats = [
            save: ['json']
    ]

    EvidenceController() {
        super(Evidence)
    }
}