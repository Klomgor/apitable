/**
 * Api Document
 * Backend_Server Api Document
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* Login Result Vo
*/
export class DeveloperVo {
    /**
    * login user uuid
    */
    'uuid'?: string;
    /**
    * login user name
    */
    'username'?: string;
    'verified'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "uuid",
            "baseName": "uuid",
            "type": "string",
            "format": ""
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string",
            "format": ""
        },
        {
            "name": "verified",
            "baseName": "verified",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeveloperVo.attributeTypeMap;
    }

    public constructor() {
    }
}
