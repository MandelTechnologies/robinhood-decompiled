package com.withpersona.sdk2.inquiry.p424ui.network;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressDetailsResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "", "attributes", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AddressDetailsResponse {
    private final AddressDetailsResponse2 attributes;

    public AddressDetailsResponse(AddressDetailsResponse2 attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.attributes = attributes;
    }

    public final AddressDetailsResponse2 getAttributes() {
        return this.attributes;
    }
}
