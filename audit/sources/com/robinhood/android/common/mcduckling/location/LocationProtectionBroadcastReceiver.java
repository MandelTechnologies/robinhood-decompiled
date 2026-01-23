package com.robinhood.android.common.mcduckling.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.robinhood.android.common.util.Compat;
import com.robinhood.api.retrofit.Atlas;
import com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver;
import com.robinhood.models.api.ApiLocation;
import com.robinhood.prefs.Installation;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Instant;
import p479j$.time.OffsetDateTime;
import p479j$.time.ZoneOffset;
import timber.log.Timber;

/* compiled from: LocationProtectionBroadcastReceiver.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver;", "Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiver;", "<init>", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "getLogoutKillswitch", "()Lcom/robinhood/utils/LogoutKillswitch;", "setLogoutKillswitch", "(Lcom/robinhood/utils/LogoutKillswitch;)V", "atlas", "Lcom/robinhood/api/retrofit/Atlas;", "getAtlas", "()Lcom/robinhood/api/retrofit/Atlas;", "setAtlas", "(Lcom/robinhood/api/retrofit/Atlas;)V", "installation", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "setInstallation", "(Lcom/robinhood/prefs/Installation;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LocationProtectionBroadcastReceiver extends HammerBroadcastReceiver {
    private static final String ACTION_LOCATION_PROTECTION_PROCESS_UPDATES = "com.robinhood.android.mcduckling.location.ACTION_LOCATION_PROTECTION_PROCESS_UPDATES";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Atlas atlas;

    @RootCoroutineScope
    public CoroutineScope coroutineScope;
    public Installation installation;
    public LogoutKillswitch logoutKillswitch;

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    public final LogoutKillswitch getLogoutKillswitch() {
        LogoutKillswitch logoutKillswitch = this.logoutKillswitch;
        if (logoutKillswitch != null) {
            return logoutKillswitch;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logoutKillswitch");
        return null;
    }

    public final void setLogoutKillswitch(LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "<set-?>");
        this.logoutKillswitch = logoutKillswitch;
    }

    public final Atlas getAtlas() {
        Atlas atlas = this.atlas;
        if (atlas != null) {
            return atlas;
        }
        Intrinsics.throwUninitializedPropertyAccessException("atlas");
        return null;
    }

    public final void setAtlas(Atlas atlas) {
        Intrinsics.checkNotNullParameter(atlas, "<set-?>");
        this.atlas = atlas;
    }

    public final Installation getInstallation() {
        Installation installation = this.installation;
        if (installation != null) {
            return installation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("installation");
        return null;
    }

    public final void setInstallation(Installation installation) {
        Intrinsics.checkNotNullParameter(installation, "<set-?>");
        this.installation = installation;
    }

    @Override // com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        if (Intrinsics.areEqual(intent.getAction(), ACTION_LOCATION_PROTECTION_PROCESS_UPDATES)) {
            if (getLogoutKillswitch().isLoggedOut()) {
                LocationServices.getFusedLocationProviderClient(context).removeLocationUpdates(INSTANCE.getPendingIntent(context));
                return;
            }
            LocationResult locationResultExtractResult = LocationResult.extractResult(intent);
            if (locationResultExtractResult == null) {
                return;
            }
            Timber.INSTANCE.mo3350d("Received new locations", new Object[0]);
            Location lastLocation = locationResultExtractResult.getLastLocation();
            if (lastLocation == null) {
                return;
            }
            Double dValueOf = lastLocation.hasAltitude() ? Double.valueOf(lastLocation.getAltitude()) : null;
            Float fValueOf = lastLocation.hasSpeed() ? Float.valueOf(lastLocation.getSpeed()) : null;
            Float fValueOf2 = lastLocation.hasAccuracy() ? Float.valueOf(lastLocation.getAccuracy()) : null;
            Float fValueOf3 = (Compat.INSTANCE.isApiSupported(26) && lastLocation.hasVerticalAccuracy()) ? Float.valueOf(lastLocation.getVerticalAccuracyMeters()) : null;
            String strMo2745id = getInstallation().mo2745id();
            OffsetDateTime offsetDateTimeAtOffset = Instant.ofEpochMilli(lastLocation.getTime()).atOffset(ZoneOffset.UTC);
            Intrinsics.checkNotNullExpressionValue(offsetDateTimeAtOffset, "atOffset(...)");
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C112601(new ApiLocation(strMo2745id, offsetDateTimeAtOffset, lastLocation.getLatitude(), lastLocation.getLongitude(), dValueOf, null, fValueOf, null, fValueOf2, fValueOf3), null), 3, null);
        }
    }

    /* compiled from: LocationProtectionBroadcastReceiver.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.mcduckling.location.LocationProtectionBroadcastReceiver$onReceive$1", m3645f = "LocationProtectionBroadcastReceiver.kt", m3646l = {93}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.mcduckling.location.LocationProtectionBroadcastReceiver$onReceive$1 */
    static final class C112601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiLocation $apiLocation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112601(ApiLocation apiLocation, Continuation<? super C112601> continuation) {
            super(2, continuation);
            this.$apiLocation = apiLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C112601 c112601 = LocationProtectionBroadcastReceiver.this.new C112601(this.$apiLocation, continuation);
            c112601.L$0 = obj;
            return c112601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LocationProtectionBroadcastReceiver locationProtectionBroadcastReceiver = LocationProtectionBroadcastReceiver.this;
                    ApiLocation apiLocation = this.$apiLocation;
                    Result.Companion companion = Result.INSTANCE;
                    Atlas atlas = locationProtectionBroadcastReceiver.getAtlas();
                    List<ApiLocation> listListOf = CollectionsKt.listOf(apiLocation);
                    this.label = 1;
                    if (atlas.postLocation(listListOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                Timber.INSTANCE.mo3350d("Location protection upload success", new Object[0]);
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                Timber.INSTANCE.mo3355e(thM28553exceptionOrNullimpl, "Location protection upload failure", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LocationProtectionBroadcastReceiver.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/LocationProtectionBroadcastReceiver$Companion;", "", "<init>", "()V", "ACTION_LOCATION_PROTECTION_PROCESS_UPDATES", "", "getPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PendingIntent getPendingIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LocationProtectionBroadcastReceiver.class);
            intent.setAction(LocationProtectionBroadcastReceiver.ACTION_LOCATION_PROTECTION_PROCESS_UPDATES);
            Unit unit = Unit.INSTANCE;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            return broadcast;
        }
    }
}
