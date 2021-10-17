import * as format from "./format"
// @ponicode
describe("format.round", () => {
    test("0", () => {
        let callFunction: any = () => {
            format.round(16, 2)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("1", () => {
        let callFunction: any = () => {
            format.round(10, 9)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("2", () => {
        let callFunction: any = () => {
            format.round(0, 14)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("3", () => {
        let callFunction: any = () => {
            format.round(64, 9)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("4", () => {
        let callFunction: any = () => {
            format.round(64, 0)
        }
    
        expect(callFunction).not.toThrow()
    })

    test("5", () => {
        let callFunction: any = () => {
            format.round(NaN, NaN)
        }
    
        expect(callFunction).not.toThrow()
    })
})

// @ponicode
describe("format.formatLocalDate", () => {
    test("0", () => {
        let callFunction: any = () => {
            format.formatLocalDate("01-13-2020", "definition-checksum\\s(?P<checksum>\\w+)")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("1", () => {
        let callFunction: any = () => {
            format.formatLocalDate("32-01-2020", "min\\s+\\d+\\s+of")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("2", () => {
        let callFunction: any = () => {
            format.formatLocalDate("01-01-2030", "definition-signature\\s(?P<signature>[\\w=\\/+]+)")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("3", () => {
        let callFunction: any = () => {
            format.formatLocalDate("01-01-2030", "definition-checksum\\s(?P<checksum>\\w+)")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("4", () => {
        let callFunction: any = () => {
            format.formatLocalDate("32-01-2020", "(?P<first_group_name>.*)-(?P=first_group_name)")
        }
    
        expect(callFunction).not.toThrow()
    })

    test("5", () => {
        let callFunction: any = () => {
            format.formatLocalDate("", "")
        }
    
        expect(callFunction).not.toThrow()
    })
})
