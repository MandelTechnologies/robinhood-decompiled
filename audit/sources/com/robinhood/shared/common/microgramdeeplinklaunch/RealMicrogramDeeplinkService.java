package com.robinhood.shared.common.microgramdeeplinklaunch;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.microgram.deeplink.DeeplinkService;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import microgram.android.extension.ServiceExtension;
import microgram.android.service.ManagedServiceExtension2;

/* compiled from: RealMicrogramDeeplinkService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/common/microgramdeeplinklaunch/RealMicrogramDeeplinkService;", "Lcom/robinhood/microgram/deeplink/DeeplinkService;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;)V", "kotlin.jvm.PlatformType", "openDeeplink", "", "deeplink", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openDeeplinkWithOptions", "alwaysPresentOnTop", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-microgram-deeplink-launch_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RealMicrogramDeeplinkService implements DeeplinkService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final Navigator navigator;

    public RealMicrogramDeeplinkService(Context context, Navigator navigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
        this.context = context.getApplicationContext();
    }

    @Override // com.robinhood.microgram.deeplink.DeeplinkService
    public Object openDeeplink(String str, Continuation<? super Unit> continuation) {
        Uri uri = Uri.parse(str);
        Navigator navigator = this.navigator;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, boxing.boxBoolean(false), null, false, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.microgram.deeplink.DeeplinkService
    public Object openDeeplinkWithOptions(String str, boolean z, Continuation<? super Unit> continuation) {
        Object objOpenDeeplink = openDeeplink(str, continuation);
        return objOpenDeeplink == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOpenDeeplink : Unit.INSTANCE;
    }

    /* compiled from: RealMicrogramDeeplinkService.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/microgramdeeplinklaunch/RealMicrogramDeeplinkService$Companion;", "", "<init>", "()V", "getExtension", "Lkotlin/Pair;", "", "Lmicrogram/android/extension/ServiceExtension$Factory;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "lib-microgram-deeplink-launch_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Tuples2<String, ServiceExtension.Factory> getExtension(Context context, Navigator navigator) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(DeeplinkService.class), new RealMicrogramDeeplinkService(context, navigator));
        }
    }
}
