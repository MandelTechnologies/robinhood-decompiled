package com.withpersona.sdk2.inquiry.steps.p423ui.network;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressAutocompleteResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "", Constants.REFERRER_API_META, "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;)V", "getMeta", "()Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AddressAutocompleteResponse {
    private final AddressAutocompleteResponse2 meta;

    public AddressAutocompleteResponse(AddressAutocompleteResponse2 meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    public final AddressAutocompleteResponse2 getMeta() {
        return this.meta;
    }
}
