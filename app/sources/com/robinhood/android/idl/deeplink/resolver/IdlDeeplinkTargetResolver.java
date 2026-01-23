package com.robinhood.android.idl.deeplink.resolver;

import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget3;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.shared.app.type.AppType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdlDeeplinkTargetResolver.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u001e\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/idl/deeplink/resolver/IdlDeeplinkTargetResolver;", "", "idlDeeplinkSetLazy", "Ldagger/Lazy;", "", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "rhDeeplinkSupportedUris", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ldagger/Lazy;Ljava/util/Set;Lcom/robinhood/shared/app/type/AppType;)V", "deeplinkTargets", "", "", "getDeeplinkTargets", "()Ljava/util/Map;", "deeplinkTargets$delegate", "Lkotlin/Lazy;", "match", "uri", "Landroid/net/Uri;", "lib-idl-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IdlDeeplinkTargetResolver {
    private final AppType appType;

    /* renamed from: deeplinkTargets$delegate, reason: from kotlin metadata */
    private final Lazy deeplinkTargets;
    private final dagger.Lazy<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy;
    private final Set<RhDeeplinkSupportedUri> rhDeeplinkSupportedUris;

    /* JADX WARN: Multi-variable type inference failed */
    public IdlDeeplinkTargetResolver(dagger.Lazy<Set<DeeplinkTarget3<?>>> idlDeeplinkSetLazy, Set<? extends RhDeeplinkSupportedUri> rhDeeplinkSupportedUris, AppType appType) {
        Intrinsics.checkNotNullParameter(idlDeeplinkSetLazy, "idlDeeplinkSetLazy");
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUris, "rhDeeplinkSupportedUris");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.idlDeeplinkSetLazy = idlDeeplinkSetLazy;
        this.rhDeeplinkSupportedUris = rhDeeplinkSupportedUris;
        this.appType = appType;
        this.deeplinkTargets = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.idl.deeplink.resolver.IdlDeeplinkTargetResolver$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IdlDeeplinkTargetResolver.deeplinkTargets_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final Map<String, DeeplinkTarget3<?>> getDeeplinkTargets() {
        return (Map) this.deeplinkTargets.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map deeplinkTargets_delegate$lambda$0(IdlDeeplinkTargetResolver idlDeeplinkTargetResolver) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DeeplinkTarget3<?> deeplinkTarget3 : idlDeeplinkTargetResolver.idlDeeplinkSetLazy.get()) {
            if (deeplinkTarget3.getSupportedAppTypes().contains(idlDeeplinkTargetResolver.appType)) {
                if (linkedHashMap.containsKey(deeplinkTarget3.getPath())) {
                    throw new IllegalStateException(("Duplicate route found: `" + deeplinkTarget3.getPath() + "`").toString());
                }
                linkedHashMap.put(deeplinkTarget3.getPath(), deeplinkTarget3);
            }
        }
        return linkedHashMap;
    }

    public final DeeplinkTarget3<?> match(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Set<RhDeeplinkSupportedUri> set = this.rhDeeplinkSupportedUris;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((RhDeeplinkSupportedUri) it.next()).getUri());
        }
        String strFindRoute = IdlDeeplinkTargetResolver2.findRoute(arrayList, uri);
        if (strFindRoute == null) {
            return null;
        }
        return getDeeplinkTargets().get(strFindRoute);
    }
}
