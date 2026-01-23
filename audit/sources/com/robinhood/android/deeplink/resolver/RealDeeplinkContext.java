package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.Experiment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;

/* compiled from: RealDeeplinkContext.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0016\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u0002H\u001e\"\u0018\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u001f*\b\u0012\u0004\u0012\u0002H\u001e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"2\u0006\u0010#\u001a\u0002H\u001eH\u0016¢\u0006\u0002\u0010$J=\u0010%\u001a\u0002H\u001e\"\u0018\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u001e0\u001f*\b\u0012\u0004\u0012\u0002H\u001e0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0&2\u0006\u0010#\u001a\u0002H\u001eH\u0016¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020\t2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0016J\u0014\u0010)\u001a\u00020\t2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030&H\u0016J)\u0010*\u001a\u00020\t2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0\u0019\"\u00020,2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u001aH\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010\u001a2\u0006\u00100\u001a\u00020\tH\u0016J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0002\u00103J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u00103J\b\u00104\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/deeplink/resolver/RealDeeplinkContext;", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "requiresBackingActivity", "", "uri", "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "authManagerLazy", "Ldagger/Lazy;", "Lcom/robinhood/shared/security/auth/AuthManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "isSupported", "Lkotlin/Function1;", "redirectGetIntents", "Lkotlin/Function3;", "", "Landroid/content/Intent;", "<init>", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/analytics/DeeplinkEventLogger;ZLandroid/net/Uri;Lcom/robinhood/android/navigation/DeepLinkOrigin;Ldagger/Lazy;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getExperimentVariant", "V", "Lcom/robinhood/enums/RhEnum;", "", "experiment", "Lcom/robinhood/experiments/Experiment;", "defaultVariant", "(Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;)Ljava/lang/Enum;", "getDeviceIdExperimentVariant", "Lcom/robinhood/experiments/DeviceIdExperiment;", "(Lcom/robinhood/experiments/DeviceIdExperiment;Ljava/lang/Enum;)Ljava/lang/Enum;", "getExperimentState", "getDeviceIdExperimentState", "getRegionGateState", "regionGates", "Lcom/robinhood/android/regiongate/RegionGate;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "([Lcom/robinhood/android/regiongate/RegionGate;Z)Z", "getMainIntent", "requiresMainActivity", "handleMalformedUri", WebsocketGatewayConstants.DATA_KEY, "(Landroid/net/Uri;)[Landroid/content/Intent;", "isLoggedIn", "lib-deeplink-resolver_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RealDeeplinkContext extends DeeplinkTarget2 {
    private final Lazy<AuthManager> authManagerLazy;
    private final ExperimentsStore experimentsStore;
    private final Function1<Uri, Boolean> isSupported;
    private final Function3<Context, Uri, DeepLinkOrigin, Intent[]> redirectGetIntents;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealDeeplinkContext(Context context, Navigator navigator, DeeplinkEventLogger eventLogger, boolean z, Uri uri, DeepLinkOrigin deepLinkOrigin, Lazy<AuthManager> authManagerLazy, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, Function1<? super Uri, Boolean> isSupported, Function3<? super Context, ? super Uri, ? super DeepLinkOrigin, Intent[]> redirectGetIntents) {
        super(context, navigator, eventLogger, z, uri, deepLinkOrigin);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(deepLinkOrigin, "deepLinkOrigin");
        Intrinsics.checkNotNullParameter(authManagerLazy, "authManagerLazy");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(isSupported, "isSupported");
        Intrinsics.checkNotNullParameter(redirectGetIntents, "redirectGetIntents");
        this.authManagerLazy = authManagerLazy;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.isSupported = isSupported;
        this.redirectGetIntents = redirectGetIntents;
    }

    /* JADX WARN: Incorrect return type in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/experiments/Experiment<TV;>;TV;)TV; */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Enum getExperimentVariant(Experiment experiment, Enum defaultVariant) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(defaultVariant, "defaultVariant");
        return ExperimentUtils.getExperimentVariant(this.experimentsStore, experiment, defaultVariant);
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: RealDeeplinkContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "V", "Lcom/robinhood/enums/RhEnum;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getDeviceIdExperimentVariant$1", m3645f = "RealDeeplinkContext.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getDeviceIdExperimentVariant$1 */
    static final class C139561<V> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super V>, Object> {

        /* JADX INFO: Incorrect field signature: TV; */
        final /* synthetic */ Enum $defaultVariant;
        final /* synthetic */ DeviceIdExperiment<V> $experiment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/robinhood/android/deeplink/resolver/RealDeeplinkContext;Lcom/robinhood/experiments/DeviceIdExperiment<TV;>;TV;Lkotlin/coroutines/Continuation<-Lcom/robinhood/android/deeplink/resolver/RealDeeplinkContext$getDeviceIdExperimentVariant$1;>;)V */
        C139561(DeviceIdExperiment deviceIdExperiment, Enum r3, Continuation continuation) {
            super(2, continuation);
            this.$experiment = deviceIdExperiment;
            this.$defaultVariant = r3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealDeeplinkContext.this.new C139561(this.$experiment, this.$defaultVariant, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super V> continuation) {
            return ((C139561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ExperimentsStore experimentsStore = RealDeeplinkContext.this.experimentsStore;
            DeviceIdExperiment<V> deviceIdExperiment = this.$experiment;
            Enum r3 = this.$defaultVariant;
            this.label = 1;
            Object deviceIdExperimentVariant = ExperimentUtils.getDeviceIdExperimentVariant(experimentsStore, deviceIdExperiment, r3, this);
            return deviceIdExperimentVariant == coroutine_suspended ? coroutine_suspended : deviceIdExperimentVariant;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/experiments/DeviceIdExperiment<TV;>;TV;)TV; */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Enum getDeviceIdExperimentVariant(DeviceIdExperiment experiment, Enum defaultVariant) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(defaultVariant, "defaultVariant");
        return (Enum) BuildersKt__BuildersKt.runBlocking$default(null, new C139561(experiment, defaultVariant, null), 1, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public boolean getExperimentState(Experiment<?> experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        return ExperimentUtils.getExperimentState(this.experimentsStore, experiment);
    }

    /* compiled from: RealDeeplinkContext.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getDeviceIdExperimentState$1", m3645f = "RealDeeplinkContext.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getDeviceIdExperimentState$1 */
    static final class C139551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ DeviceIdExperiment<?> $experiment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139551(DeviceIdExperiment<?> deviceIdExperiment, Continuation<? super C139551> continuation) {
            super(2, continuation);
            this.$experiment = deviceIdExperiment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealDeeplinkContext.this.new C139551(this.$experiment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ExperimentsStore experimentsStore = RealDeeplinkContext.this.experimentsStore;
            DeviceIdExperiment<?> deviceIdExperiment = this.$experiment;
            this.label = 1;
            Object deviceIdExperimentState = ExperimentUtils.getDeviceIdExperimentState(experimentsStore, deviceIdExperiment, this);
            return deviceIdExperimentState == coroutine_suspended ? coroutine_suspended : deviceIdExperimentState;
        }
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public boolean getDeviceIdExperimentState(DeviceIdExperiment<?> experiment) {
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C139551(experiment, null), 1, null)).booleanValue();
    }

    /* compiled from: RealDeeplinkContext.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1", m3645f = "RealDeeplinkContext.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1 */
    static final class C139571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ boolean $default;
        final /* synthetic */ RegionGate[] $regionGates;
        int label;
        final /* synthetic */ RealDeeplinkContext this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139571(boolean z, RegionGate[] regionGateArr, RealDeeplinkContext realDeeplinkContext, Continuation<? super C139571> continuation) {
            super(2, continuation);
            this.$default = z;
            this.$regionGates = regionGateArr;
            this.this$0 = realDeeplinkContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139571(this.$default, this.$regionGates, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = RealDeeplinkContext3.DEEPLINK_BLOCKING_TIMEOUT;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$regionGates, this.this$0, null);
                    this.label = 1;
                    obj = Timeout6.m28789withTimeoutKLykuaI(j, anonymousClass1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } catch (Exception unused) {
                zBooleanValue = this.$default;
            }
            return boxing.boxBoolean(zBooleanValue);
        }

        /* compiled from: RealDeeplinkContext.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1$1", m3645f = "RealDeeplinkContext.kt", m3646l = {80}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            final /* synthetic */ RegionGate[] $regionGates;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RealDeeplinkContext this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RegionGate[] regionGateArr, RealDeeplinkContext realDeeplinkContext, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$regionGates = regionGateArr;
                this.this$0 = realDeeplinkContext;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$regionGates, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                boolean z = false;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    RegionGate[] regionGateArr = this.$regionGates;
                    RealDeeplinkContext realDeeplinkContext = this.this$0;
                    ArrayList arrayList = new ArrayList(regionGateArr.length);
                    for (RegionGate regionGate : regionGateArr) {
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RealDeeplinkContext2(realDeeplinkContext, regionGate, null), 3, null));
                    }
                    this.label = 1;
                    obj = Await2.awaitAll(arrayList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z = true;
                } else {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            break;
                        }
                    }
                    z = true;
                }
                return boxing.boxBoolean(z);
            }
        }
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public boolean getRegionGateState(RegionGate[] regionGates, boolean z) {
        Intrinsics.checkNotNullParameter(regionGates, "regionGates");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C139571(z, regionGates, this, null), 1, null)).booleanValue();
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Intent getMainIntent() {
        return NavigatorUtils.getMainIntent(getNavigator(), getContext());
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Intent getMainIntent(boolean requiresMainActivity) {
        return NavigatorUtils.getMainIntent(getNavigator(), getContext(), requiresMainActivity);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Intent[] handleMalformedUri(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return NavigatorUtils.handleMalformedUri(getNavigator(), getContext(), data);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public boolean isSupported(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.isSupported.invoke(uri).booleanValue();
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public Intent[] redirectGetIntents(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return this.redirectGetIntents.invoke(getContext(), uri, getDeepLinkOrigin());
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget2
    public boolean isLoggedIn() {
        return this.authManagerLazy.get().isLoggedIn();
    }
}
