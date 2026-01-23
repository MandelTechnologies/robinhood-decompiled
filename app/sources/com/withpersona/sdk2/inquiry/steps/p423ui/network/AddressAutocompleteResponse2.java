package com.withpersona.sdk2.inquiry.steps.p423ui.network;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressAutocompleteResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "", "predictions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "<init>", "(Ljava/util/List;)V", "getPredictions", "()Ljava/util/List;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.network.Meta, reason: use source file name */
/* loaded from: classes18.dex */
public final class AddressAutocompleteResponse2 {
    private final List<AddressAutocompleteResponse3> predictions;

    public AddressAutocompleteResponse2(List<AddressAutocompleteResponse3> predictions) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        this.predictions = predictions;
    }

    public final List<AddressAutocompleteResponse3> getPredictions() {
        return this.predictions;
    }
}
