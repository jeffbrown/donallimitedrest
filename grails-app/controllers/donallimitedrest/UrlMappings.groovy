package donallimitedrest

class UrlMappings {

    static mappings = {
        "/evidence"(resources: 'evidence', includes: ['save'])

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
