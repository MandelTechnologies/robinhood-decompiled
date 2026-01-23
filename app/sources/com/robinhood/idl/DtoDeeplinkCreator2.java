package com.robinhood.idl;

import android.net.Uri;
import com.robinhood.idl.serialization.uri.UriFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DtoDeeplinkCreator.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"encodeToUri", "Landroid/net/Uri;", "D", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "value", "rhDeeplinkSupportedUri", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "(Lcom/robinhood/idl/DtoDeeplinkCreator;Lcom/robinhood/idl/MessageDto;Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "lib-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.idl.DtoDeeplinkCreatorKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class DtoDeeplinkCreator2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <D extends Dto3<?>> Uri encodeToUri(DtoDeeplinkCreator<D> dtoDeeplinkCreator, D value, RhDeeplinkSupportedUri rhDeeplinkSupportedUri) {
        Intrinsics.checkNotNullParameter(dtoDeeplinkCreator, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        return new UriFormat(null, 1, 0 == true ? 1 : 0).encodeToUri(dtoDeeplinkCreator.getDefaultSerializer(), value, rhDeeplinkSupportedUri.getUri(), dtoDeeplinkCreator.getDeeplinkRoute());
    }
}
