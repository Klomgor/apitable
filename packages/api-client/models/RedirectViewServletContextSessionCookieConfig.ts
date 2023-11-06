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

export class RedirectViewServletContextSessionCookieConfig {
    'comment'?: string;
    'domain'?: string;
    'path'?: string;
    'secure'?: boolean;
    'httpOnly'?: boolean;
    'maxAge'?: number;
    'name'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string",
            "format": ""
        },
        {
            "name": "domain",
            "baseName": "domain",
            "type": "string",
            "format": ""
        },
        {
            "name": "path",
            "baseName": "path",
            "type": "string",
            "format": ""
        },
        {
            "name": "secure",
            "baseName": "secure",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "httpOnly",
            "baseName": "httpOnly",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "maxAge",
            "baseName": "maxAge",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RedirectViewServletContextSessionCookieConfig.attributeTypeMap;
    }

    public constructor() {
    }
}
