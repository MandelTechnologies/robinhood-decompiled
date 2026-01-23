package com.robinhood.android.deeplink;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: DeeplinkMultibindingModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeeplinkMultibindingModule;", "", "deeplinkResolvers", "", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "getDeeplinkResolvers", "()Ljava/util/Set;", "idlDeeplinkTarget", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "getIdlDeeplinkTarget", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface DeeplinkMultibindingModule {
    Set<DeeplinkTarget4> getDeeplinkResolvers();

    Set<DeeplinkTarget3<?>> getIdlDeeplinkTarget();
}
