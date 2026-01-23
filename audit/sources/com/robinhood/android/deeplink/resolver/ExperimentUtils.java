package com.robinhood.android.deeplink.resolver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.ProcessInvariantExperiment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ExperimentUtils.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0082@¢\u0006\u0002\u0010\u000b\u001a7\u0010\f\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0082@¢\u0006\u0002\u0010\u000b\u001a-\u0010\r\u001a\u00020\u0004*\u00020\u000e2\u001a\u0010\u000f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010\"\u0006\u0012\u0002\b\u00030\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001aB\u0010\u0013\u001a\u0002H\u0014\"\u0018\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u0016*\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00182\u0006\u0010\u0019\u001a\u0002H\u0014H\u0080@¢\u0006\u0002\u0010\u001a\u001aA\u0010\u001b\u001a\u0002H\u0014\"\u0018\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u0016*\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00112\u0006\u0010\u0019\u001a\u0002H\u0014H\u0000¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u000e2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0080@¢\u0006\u0002\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030 2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030!H\u0080@¢\u0006\u0002\u0010\"\u001a\"\u0010#\u001a\u00020$*\u0006\u0012\u0002\b\u00030 2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"EXPERIMENT_FETCH_TIMEOUT_MILLIS", "", "DEVICE_ID_EXPERIMENT_FETCH_TIMEOUT_MILLIS", "fetchDeviceIdExperimentTimeout", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchExperimentTimeout", "getExperimentState", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experiments", "", "Lcom/robinhood/experiments/Experiment;", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;[Lcom/robinhood/experiments/Experiment;)Z", "getDeviceIdExperimentVariant", "V", "Lcom/robinhood/enums/RhEnum;", "", "experiment", "Lcom/robinhood/experiments/DeviceIdExperiment;", "defaultVariant", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/DeviceIdExperiment;Ljava/lang/Enum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExperimentVariant", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/Experiment;Ljava/lang/Enum;)Ljava/lang/Enum;", "getDeviceIdExperimentState", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/DeviceIdExperiment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamExperimentState", "Lcom/robinhood/android/deeplink/resolver/BaseRealDeepLinkResolver;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "(Lcom/robinhood/android/deeplink/resolver/BaseRealDeepLinkResolver;Lcom/robinhood/experiments/ExperimentDeclaration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "controlIntent", "Lcom/robinhood/android/navigation/DeepLink;", "deeplink", "isFromRegionGate", "lib-deeplink-resolver_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ExperimentUtils {
    private static final long DEVICE_ID_EXPERIMENT_FETCH_TIMEOUT_MILLIS = 3000;
    private static final long EXPERIMENT_FETCH_TIMEOUT_MILLIS = 500;

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt", m3645f = "ExperimentUtils.kt", m3646l = {93, 95, 99}, m3647m = "streamExperimentState")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$1 */
    static final class C139501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C139501(Continuation<? super C139501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ExperimentUtils.streamExperimentState(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchDeviceIdExperimentTimeout(Function2<? super CoroutineScope, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Boolean> continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        return Operators.m22188withTimeoutWithDefaultrnQQ1Ag(Duration3.toDuration(3000L, DurationUnitJvm.MILLISECONDS), boxing.boxBoolean(false), function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchExperimentTimeout(Function2<? super CoroutineScope, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Boolean> continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        return Operators.m22188withTimeoutWithDefaultrnQQ1Ag(Duration3.toDuration(500L, DurationUnitJvm.MILLISECONDS), boxing.boxBoolean(false), function2, continuation);
    }

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getExperimentState$1", m3645f = "ExperimentUtils.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getExperimentState$1 */
    static final class C139491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Experiment<?>[] $experiments;
        final /* synthetic */ ExperimentsStore $this_getExperimentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139491(ExperimentsStore experimentsStore, Experiment<?>[] experimentArr, Continuation<? super C139491> continuation) {
            super(2, continuation);
            this.$this_getExperimentState = experimentsStore;
            this.$experiments = experimentArr;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139491(this.$this_getExperimentState, this.$experiments, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ExperimentsStore experimentsStore = this.$this_getExperimentState;
            Experiment<?>[] experimentArr = this.$experiments;
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, (Experiment[]) Arrays.copyOf(experimentArr, experimentArr.length), false, null, 6, null);
            Duration.Companion companion = Duration.INSTANCE;
            Flow flowM22187timeoutWithDefault8Mi8wO0 = Operators.m22187timeoutWithDefault8Mi8wO0(flowStreamStateFlow$default, Duration3.toDuration(500L, DurationUnitJvm.MILLISECONDS), boxing.boxBoolean(false));
            this.label = 1;
            Object objFirst = FlowKt.first(flowM22187timeoutWithDefault8Mi8wO0, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    public static final boolean getExperimentState(ExperimentsStore experimentsStore, Experiment<?>... experiments) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<this>");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C139491(experimentsStore, experiments, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Incorrect types in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/DeviceIdExperiment<TV;>;TV;Lkotlin/coroutines/Continuation<-TV;>;)Ljava/lang/Object; */
    public static final Object getDeviceIdExperimentVariant(ExperimentsStore experimentsStore, DeviceIdExperiment deviceIdExperiment, Enum r6, Continuation continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        return Operators.m22188withTimeoutWithDefaultrnQQ1Ag(Duration3.toDuration(3000L, DurationUnitJvm.MILLISECONDS), r6, new C139482(experimentsStore, deviceIdExperiment, r6, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "V", "Lcom/robinhood/enums/RhEnum;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getDeviceIdExperimentVariant$2", m3645f = "ExperimentUtils.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getDeviceIdExperimentVariant$2 */
    static final class C139482<V> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super V>, Object> {

        /* JADX INFO: Incorrect field signature: TV; */
        final /* synthetic */ Enum $defaultVariant;
        final /* synthetic */ DeviceIdExperiment<V> $experiment;
        final /* synthetic */ ExperimentsStore $this_getDeviceIdExperimentVariant;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/DeviceIdExperiment<TV;>;TV;Lkotlin/coroutines/Continuation<-Lcom/robinhood/android/deeplink/resolver/ExperimentUtilsKt$getDeviceIdExperimentVariant$2;>;)V */
        C139482(ExperimentsStore experimentsStore, DeviceIdExperiment deviceIdExperiment, Enum r3, Continuation continuation) {
            super(2, continuation);
            this.$this_getDeviceIdExperimentVariant = experimentsStore;
            this.$experiment = deviceIdExperiment;
            this.$defaultVariant = r3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139482(this.$this_getDeviceIdExperimentVariant, this.$experiment, this.$defaultVariant, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super V> continuation) {
            return ((C139482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ExperimentsStore experimentsStore = this.$this_getDeviceIdExperimentVariant;
            DeviceIdExperiment<V> deviceIdExperiment = this.$experiment;
            Enum r3 = this.$defaultVariant;
            this.label = 1;
            Object variant$default = ExperimentsStore.getVariant$default(experimentsStore, deviceIdExperiment, r3, false, this, 4, null);
            return variant$default == coroutine_suspended ? coroutine_suspended : variant$default;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <V:Ljava/lang/Enum<TV;>;:Lcom/robinhood/enums/RhEnum<TV;>;>(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/experiments/Experiment<TV;>;TV;)TV; */
    public static final Enum getExperimentVariant(ExperimentsStore experimentsStore, Experiment experiment, Enum defaultVariant) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(defaultVariant, "defaultVariant");
        Object objBlockingFirst = ExperimentsProvider.DefaultImpls.streamVariant$default(experimentsStore, experiment, defaultVariant, false, 4, null).timeout(500L, TimeUnit.MILLISECONDS, Observable.just(defaultVariant)).onErrorReturnItem(defaultVariant).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(objBlockingFirst, "blockingFirst(...)");
        return (Enum) objBlockingFirst;
    }

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getDeviceIdExperimentState$2", m3645f = "ExperimentUtils.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$getDeviceIdExperimentState$2 */
    static final class C139472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ DeviceIdExperiment<?> $experiment;
        final /* synthetic */ ExperimentsStore $this_getDeviceIdExperimentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139472(ExperimentsStore experimentsStore, DeviceIdExperiment<?> deviceIdExperiment, Continuation<? super C139472> continuation) {
            super(2, continuation);
            this.$this_getDeviceIdExperimentState = experimentsStore;
            this.$experiment = deviceIdExperiment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139472(this.$this_getDeviceIdExperimentState, this.$experiment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM22650coGetState0E7RQCE$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore = this.$this_getDeviceIdExperimentState;
                DeviceIdExperiment<?> deviceIdExperiment = this.$experiment;
                this.label = 1;
                objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, deviceIdExperiment, false, this, 2, null);
                if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
            }
            return Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default) ? boxing.boxBoolean(false) : objM22650coGetState0E7RQCE$default;
        }
    }

    public static final Object getDeviceIdExperimentState(ExperimentsStore experimentsStore, DeviceIdExperiment<?> deviceIdExperiment, Continuation<? super Boolean> continuation) {
        return fetchDeviceIdExperimentTimeout(new C139472(experimentsStore, deviceIdExperiment, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object streamExperimentState(BaseRealDeepLinkResolver<?> baseRealDeepLinkResolver, ExperimentDeclaration<?> experimentDeclaration, Continuation<? super Boolean> continuation) {
        C139501 c139501;
        boolean zBooleanValue;
        if (continuation instanceof C139501) {
            c139501 = (C139501) continuation;
            int i = c139501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c139501.label = i - Integer.MIN_VALUE;
            } else {
                c139501 = new C139501(continuation);
            }
        }
        Object objFetchExperimentTimeout = c139501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c139501.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetchExperimentTimeout);
                if (experimentDeclaration instanceof ProcessInvariantExperiment) {
                    C139512 c139512 = new C139512(baseRealDeepLinkResolver, experimentDeclaration, null);
                    c139501.label = 1;
                    objFetchExperimentTimeout = fetchExperimentTimeout(c139512, c139501);
                    if (objFetchExperimentTimeout == coroutine_suspended) {
                    }
                    zBooleanValue = ((Boolean) objFetchExperimentTimeout).booleanValue();
                } else if (experimentDeclaration instanceof DeviceIdExperiment) {
                    C139523 c139523 = new C139523(baseRealDeepLinkResolver, experimentDeclaration, null);
                    c139501.label = 2;
                    objFetchExperimentTimeout = fetchDeviceIdExperimentTimeout(c139523, c139501);
                    if (objFetchExperimentTimeout == coroutine_suspended) {
                    }
                    zBooleanValue = ((Boolean) objFetchExperimentTimeout).booleanValue();
                } else {
                    if (!(experimentDeclaration instanceof Experiment)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C139534 c139534 = new C139534(baseRealDeepLinkResolver, experimentDeclaration, null);
                    c139501.label = 3;
                    objFetchExperimentTimeout = fetchExperimentTimeout(c139534, c139501);
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(objFetchExperimentTimeout);
                zBooleanValue = ((Boolean) objFetchExperimentTimeout).booleanValue();
            } else if (i2 == 2) {
                ResultKt.throwOnFailure(objFetchExperimentTimeout);
                zBooleanValue = ((Boolean) objFetchExperimentTimeout).booleanValue();
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchExperimentTimeout);
                zBooleanValue = ((Boolean) objFetchExperimentTimeout).booleanValue();
            }
            return boxing.boxBoolean(zBooleanValue);
        } catch (Exception unused) {
            return boxing.boxBoolean(false);
        }
    }

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$2", m3645f = "ExperimentUtils.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$2 */
    static final class C139512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ExperimentDeclaration<?> $experiment;
        final /* synthetic */ BaseRealDeepLinkResolver<?> $this_streamExperimentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139512(BaseRealDeepLinkResolver<?> baseRealDeepLinkResolver, ExperimentDeclaration<?> experimentDeclaration, Continuation<? super C139512> continuation) {
            super(2, continuation);
            this.$this_streamExperimentState = baseRealDeepLinkResolver;
            this.$experiment = experimentDeclaration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139512(this.$this_streamExperimentState, this.$experiment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            ExperimentsStore experimentsStore$lib_deeplink_resolver_externalDebug = this.$this_streamExperimentState.getExperimentsStore$lib_deeplink_resolver_externalDebug();
            ProcessInvariantExperiment[] processInvariantExperimentArr = {this.$experiment};
            this.label = 1;
            Object state$default = ExperimentsProvider.DefaultImpls.getState$default(experimentsStore$lib_deeplink_resolver_externalDebug, processInvariantExperimentArr, false, null, this, 6, null);
            return state$default == coroutine_suspended ? coroutine_suspended : state$default;
        }
    }

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$3", m3645f = "ExperimentUtils.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$3 */
    static final class C139523 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ExperimentDeclaration<?> $experiment;
        final /* synthetic */ BaseRealDeepLinkResolver<?> $this_streamExperimentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139523(BaseRealDeepLinkResolver<?> baseRealDeepLinkResolver, ExperimentDeclaration<?> experimentDeclaration, Continuation<? super C139523> continuation) {
            super(2, continuation);
            this.$this_streamExperimentState = baseRealDeepLinkResolver;
            this.$experiment = experimentDeclaration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139523(this.$this_streamExperimentState, this.$experiment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139523) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM22650coGetState0E7RQCE$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ExperimentsStore experimentsStore$lib_deeplink_resolver_externalDebug = this.$this_streamExperimentState.getExperimentsStore$lib_deeplink_resolver_externalDebug();
                DeviceIdExperiment deviceIdExperiment = (DeviceIdExperiment) this.$experiment;
                this.label = 1;
                objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore$lib_deeplink_resolver_externalDebug, deviceIdExperiment, false, this, 2, null);
                if (objM22650coGetState0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
            }
            return Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default) ? boxing.boxBoolean(false) : objM22650coGetState0E7RQCE$default;
        }
    }

    /* compiled from: ExperimentUtils.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$4", m3645f = "ExperimentUtils.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$streamExperimentState$4 */
    static final class C139534 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ ExperimentDeclaration<?> $experiment;
        final /* synthetic */ BaseRealDeepLinkResolver<?> $this_streamExperimentState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C139534(BaseRealDeepLinkResolver<?> baseRealDeepLinkResolver, ExperimentDeclaration<?> experimentDeclaration, Continuation<? super C139534> continuation) {
            super(2, continuation);
            this.$this_streamExperimentState = baseRealDeepLinkResolver;
            this.$experiment = experimentDeclaration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C139534(this.$this_streamExperimentState, this.$experiment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C139534) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.$this_streamExperimentState.getExperimentsStore$lib_deeplink_resolver_externalDebug(), new Experiment[]{this.$experiment}, false, null, 6, null);
            this.label = 1;
            Object objFirst = FlowKt.first(flowStreamStateFlow$default, this);
            return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
        }
    }

    public static /* synthetic */ DeepLink controlIntent$default(BaseRealDeepLinkResolver baseRealDeepLinkResolver, DeepLink deepLink, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return controlIntent(baseRealDeepLinkResolver, deepLink, z);
    }

    public static final DeepLink controlIntent(final BaseRealDeepLinkResolver<?> baseRealDeepLinkResolver, final DeepLink deeplink, final boolean z) {
        Intrinsics.checkNotNullParameter(baseRealDeepLinkResolver, "<this>");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return deeplink.copyWithNewGetIntents(new Function2() { // from class: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExperimentUtils.controlIntent$lambda$2(baseRealDeepLinkResolver, deeplink, z, (Context) obj, (Uri) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] controlIntent$lambda$2(BaseRealDeepLinkResolver baseRealDeepLinkResolver, DeepLink deepLink, boolean z, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "<unused var>");
        Navigator navigator$lib_deeplink_resolver_externalDebug = baseRealDeepLinkResolver.getNavigator$lib_deeplink_resolver_externalDebug();
        String path = deepLink.getPath();
        Set<RegionGate> regionGates = deepLink.getRegionGates();
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator$lib_deeplink_resolver_externalDebug, context, new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, z ? new DeepLinkIntentKey.RegionGatedLoggingContext(path, regionGates != null ? CollectionsKt.joinToString$default(regionGates, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.android.deeplink.resolver.ExperimentUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExperimentUtils.controlIntent$lambda$2$lambda$0((RegionGate) obj);
            }
        }, 30, null) : null) : null, 3, null), null, false, 12, null)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence controlIntent$lambda$2$lambda$0(RegionGate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
