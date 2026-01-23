package com.withpersona.sdk2.inquiry.governmentid.network;

import com.withpersona.sdk2.camera.ImageIdMetadata;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocaptureState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "newFrame", "update", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;Lcom/withpersona/sdk2/camera/ImageIdMetadata;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "", "isFocused", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;)Z", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureStateKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class AutocaptureState2 {
    public static final AutocaptureState update(AutocaptureState autocaptureState, ImageIdMetadata newFrame) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        Intrinsics.checkNotNullParameter(newFrame, "newFrame");
        return autocaptureState.copy(CollectionsKt.plus((Collection<? extends ImageIdMetadata>) CollectionsKt.takeLast(autocaptureState.getPreviousFramesMetadata(), 2), newFrame));
    }

    public static final boolean isFocused(AutocaptureState autocaptureState) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        if (autocaptureState.getPreviousFramesMetadata().size() < 3) {
            return false;
        }
        Iterator<T> it = autocaptureState.getPreviousFramesMetadata().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((ImageIdMetadata) it.next()).getTextOnImage().length();
        }
        double size = length / autocaptureState.getPreviousFramesMetadata().size();
        double length2 = 0.0d;
        for (ImageIdMetadata imageIdMetadata : autocaptureState.getPreviousFramesMetadata()) {
            length2 += (imageIdMetadata.getTextOnImage().length() - size) * (imageIdMetadata.getTextOnImage().length() - size);
        }
        return Math.sqrt(length2 / ((double) autocaptureState.getPreviousFramesMetadata().size())) / size < 0.05d;
    }
}
