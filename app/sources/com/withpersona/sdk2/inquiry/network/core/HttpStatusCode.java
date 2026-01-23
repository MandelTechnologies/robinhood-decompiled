package com.withpersona.sdk2.inquiry.network.core;

import kotlin.ranges.PrimitiveRanges2;

/* loaded from: classes18.dex */
public final class HttpStatusCode {
    public static final int BAD_GATEWAY_502 = 502;
    public static final int CONFLICT_409 = 409;
    public static final int NETWORK_ERROR_0 = 0;
    public static final int NOT_FOUND_404 = 404;
    public static final int PAYLOAD_TOO_LARGE_413 = 413;
    public static final int TOO_MANY_REQUESTS_429 = 429;
    public static final int UNAUTHORIZED_401 = 401;
    public static final int UNPROCESSABLE_ENTITY_422 = 422;
    public static final HttpStatusCode INSTANCE = new HttpStatusCode();
    private static final PrimitiveRanges2 CLIENT_ERRORS = new PrimitiveRanges2(400, 499);
    private static final PrimitiveRanges2 SERVER_ERRORS = new PrimitiveRanges2(500, 599);

    private HttpStatusCode() {
    }

    public final PrimitiveRanges2 getCLIENT_ERRORS() {
        return CLIENT_ERRORS;
    }

    public final PrimitiveRanges2 getSERVER_ERRORS() {
        return SERVER_ERRORS;
    }
}
