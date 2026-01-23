package com.robinhood.android.util.play;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.BuildConfig;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.RhProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: GooglePlay.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0014¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/util/play/GooglePlay;", "", "<init>", "()V", "isSupportedByDevice", "", "context", "Landroid/content/Context;", "launchStoreForTrader", "launchStore", "launchStoreForPlayServices", "launchStoreForPlayStore", "launchIntent", "intent", "Landroid/content/Intent;", "playStoreIntent", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getPlayStorePackage", "", "getPlayStorePackage$lib_common_externalRelease", "GooglePayEntryPoint", "EntryPoint", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class GooglePlay {
    public static final int $stable = 0;
    public static final GooglePlay INSTANCE = new GooglePlay();

    /* compiled from: GooglePlay.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/util/play/GooglePlay$EntryPoint;", "", "getAppType", "Lcom/robinhood/shared/app/type/AppType;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface EntryPoint {
        AppType getAppType();
    }

    /* compiled from: GooglePlay.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/util/play/GooglePlay$GooglePayEntryPoint;", "", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Lcom/robinhood/utils/RhProcessLifecycleOwner;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public interface GooglePayEntryPoint {
        RhProcessLifecycleOwner getRhProcessLifecycleOwner();
    }

    /* compiled from: GooglePlay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GooglePlay() {
    }

    public final boolean isSupportedByDevice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return playStoreIntent$default(this, context, null, 2, null).resolveActivity(context.getPackageManager()) != null;
    }

    public final boolean launchStoreForTrader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return launchIntent(playStoreIntent(context, AppType.TRADER), context);
    }

    public final boolean launchStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return launchIntent(playStoreIntent$default(this, context, null, 2, null), context);
    }

    public final boolean launchStoreForPlayServices(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return launchIntent(new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority(ErrorBundle.DETAIL_ENTRY).appendQueryParameter("id", "com.google.android.gms").build()), context);
    }

    public final boolean launchStoreForPlayStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return launchIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/")), context);
    }

    private final boolean launchIntent(Intent intent, Context context) {
        ComponentCallbacks2 componentCallbacks2;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((GooglePayEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getRhProcessLifecycleOwner().useExtendedTimeout();
        context.startActivity(intent);
        return true;
    }

    public static /* synthetic */ Intent playStoreIntent$default(GooglePlay googlePlay, Context context, AppType appType, int i, Object obj) {
        if ((i & 2) != 0) {
            appType = null;
        }
        return googlePlay.playStoreIntent(context, appType);
    }

    public final Intent playStoreIntent(Context context, AppType appType) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(context, "context");
        Uri.Builder builderAuthority = new Uri.Builder().scheme("market").authority(ErrorBundle.DETAIL_ENTRY);
        if (appType == null) {
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            appType = ((EntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getAppType();
        }
        return new Intent("android.intent.action.VIEW", builderAuthority.appendQueryParameter("id", getPlayStorePackage$lib_common_externalRelease(appType)).build());
    }

    public final String getPlayStorePackage$lib_common_externalRelease(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        int i = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
        if (i == 1) {
            return "com.robinhood.gateway";
        }
        if (i == 2) {
            return "com.robinhood.global";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BuildConfig.APPLICATION_ID;
    }
}
