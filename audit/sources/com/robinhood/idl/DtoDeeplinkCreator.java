package com.robinhood.idl;

import android.net.Uri;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.serialization.uri.UriFormat;
import com.robinhood.shared.app.type.AppType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: DtoDeeplinkCreator.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/idl/DtoDeeplinkCreator;", "D", "Lcom/robinhood/idl/MessageDto;", "", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "deeplinkDeprecated", "getDeeplinkDeprecated", "decodeFromUri", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)Lcom/robinhood/idl/MessageDto;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface DtoDeeplinkCreator<D extends Dto3<?>> {
    D decodeFromUri(Uri uri);

    boolean getDeeplinkDeprecated();

    boolean getDeeplinkRequireAuthentication();

    String getDeeplinkRoute();

    List<AppType> getDeeplinkSupportedAppTypes();

    KSerializer<D> getDefaultSerializer();

    /* compiled from: DtoDeeplinkCreator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <D extends Dto3<?>> D decodeFromUri(DtoDeeplinkCreator<D> dtoDeeplinkCreator, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return (D) new UriFormat(null, 1, 0 == true ? 1 : 0).decodeFromUri(dtoDeeplinkCreator.getDefaultSerializer(), uri);
        }
    }
}
