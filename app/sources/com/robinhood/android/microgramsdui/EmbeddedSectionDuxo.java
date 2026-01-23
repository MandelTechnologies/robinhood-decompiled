package com.robinhood.android.microgramsdui;

import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.microgramsdui.EmbeddedSectionDuxo3;
import com.robinhood.android.microgramsdui.EmbeddedSectionDuxo4;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.microgramsdui.control.UiInitializer;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import com.robinhood.microgram.sdui.EmbeddedSectionResponse;
import com.robinhood.microgram.sdui.EmbeddedSectionResponse2;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.RouterMessage;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import dispatch.core.Launch;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.MicrogramLaunchId;
import microgram.android.MicrogramSource;
import microgram.android.Monitoring;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;
import microgram.p507ui.p508v1.EmbeddedSectionReadyResponseDto;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.RouterOutboundDto;
import microgram.p507ui.p508v1.ToastDto;
import rh_server_driven_ui.p531v1.AlertDto;

/* compiled from: EmbeddedSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001KB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ*\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u001dH\u0016J\u000e\u0010&\u001a\u00020'H\u0082@¢\u0006\u0002\u0010(J \u0010)\u001a\u00020\u001d2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0\u0010j\u0002`-H\u0002J\u000e\u0010.\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010(J \u0010/\u001a\u00020\u001d2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\u0010j\u0002`2H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u000200H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010\r\u001a\u000201H\u0002J\u001a\u00103\u001a\u00020\u001d2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020605J\u000e\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u000209J\u0016\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020!2\u0006\u00108\u001a\u000209J\u000e\u0010<\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020!JK\u0010=\u001a\u00020\u001d2<\u0010>\u001a8\b\u0001\u0012\u0004\u0012\u00020@\u0012\u0013\u0012\u00110!¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0D\u0012\u0006\u0012\u0004\u0018\u00010E0?¢\u0006\u0002\bFH\u0002¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020\u001dH\u0016J\b\u0010I\u001a\u00020\u001dH\u0017J\b\u0010J\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u00130\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionEvent;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/udf/DuxoBundle;)V", "instanceDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "state", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionDuxo$State;", "startResponseDeferred", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionResponse;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionResponse;", "messageHandlerJob", "Lkotlinx/coroutines/Job;", "trace", "Lcom/robinhood/android/tracing/TrackTrace;", "microgramLaunchId", "Lmicrogram/android/MicrogramLaunchId;", "getMicrogramLaunchId", "()Lmicrogram/android/MicrogramLaunchId;", "setSource", "", "source", "Lmicrogram/android/MicrogramSource;", "discriminator", "", "launchArgument", "isDynamic", "", "onCreate", "embeddedSectionView", "Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRender", "content", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "init", "emitMessage", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lmicrogram/ui/v1/RouterOutboundDto;", "Lcom/robinhood/microgram/sdui/AnyRouterMessage;", "onStateUpdated", "states", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "onAction", "action", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "onToastAction", "toastId", "onToastDismissed", "submitRouterEvent", "block", "Lkotlin/Function3;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/ParameterName;", "name", "identifier", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)V", "onDestroy", "onCleared", "notifyRouterTornDown", "State", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EmbeddedSectionDuxo extends BaseDuxo5<EmbeddedSectionDuxo4, EmbeddedSectionDuxo3> {
    public static final int $stable = 8;
    private final CompletableDeferred<MicrogramManager2> instanceDeferred;
    private Job messageHandlerJob;
    private final MicrogramManager microgramManager;
    private final CompletableDeferred<UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>> startResponseDeferred;
    private State state;
    private RhTrace6 trace;

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 123}, m3647m = "embeddedSectionView")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$embeddedSectionView$1 */
    static final class C218371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C218371(Continuation<? super C218371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmbeddedSectionDuxo.this.embeddedSectionView(this);
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 150}, m3647m = "init")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$init$1 */
    static final class C218391 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C218391(Continuation<? super C218391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmbeddedSectionDuxo.this.init(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedSectionDuxo(MicrogramManager microgramManager, DuxoBundle duxoBundle) {
        super(EmbeddedSectionDuxo4.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.microgramManager = microgramManager;
        this.instanceDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.startResponseDeferred = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.trace = RhTrace6.Noop.INSTANCE;
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/EmbeddedSectionDuxo$State;", "", "microgramLaunchId", "Lmicrogram/android/MicrogramLaunchId;", "launchArgument", "", "isDynamic", "", "<init>", "(Lmicrogram/android/MicrogramLaunchId;Ljava/lang/String;Z)V", "getMicrogramLaunchId", "()Lmicrogram/android/MicrogramLaunchId;", "getLaunchArgument", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class State {
        private final boolean isDynamic;
        private final String launchArgument;
        private final MicrogramLaunchId microgramLaunchId;

        public static /* synthetic */ State copy$default(State state, MicrogramLaunchId microgramLaunchId, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                microgramLaunchId = state.microgramLaunchId;
            }
            if ((i & 2) != 0) {
                str = state.launchArgument;
            }
            if ((i & 4) != 0) {
                z = state.isDynamic;
            }
            return state.copy(microgramLaunchId, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final MicrogramLaunchId getMicrogramLaunchId() {
            return this.microgramLaunchId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLaunchArgument() {
            return this.launchArgument;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDynamic() {
            return this.isDynamic;
        }

        public final State copy(MicrogramLaunchId microgramLaunchId, String launchArgument, boolean isDynamic) {
            Intrinsics.checkNotNullParameter(microgramLaunchId, "microgramLaunchId");
            return new State(microgramLaunchId, launchArgument, isDynamic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.microgramLaunchId, state.microgramLaunchId) && Intrinsics.areEqual(this.launchArgument, state.launchArgument) && this.isDynamic == state.isDynamic;
        }

        public int hashCode() {
            int iHashCode = this.microgramLaunchId.hashCode() * 31;
            String str = this.launchArgument;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isDynamic);
        }

        public String toString() {
            return "State(microgramLaunchId=" + this.microgramLaunchId + ", launchArgument=" + this.launchArgument + ", isDynamic=" + this.isDynamic + ")";
        }

        public State(MicrogramLaunchId microgramLaunchId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(microgramLaunchId, "microgramLaunchId");
            this.microgramLaunchId = microgramLaunchId;
            this.launchArgument = str;
            this.isDynamic = z;
        }

        public final MicrogramLaunchId getMicrogramLaunchId() {
            return this.microgramLaunchId;
        }

        public final String getLaunchArgument() {
            return this.launchArgument;
        }

        public final boolean isDynamic() {
            return this.isDynamic;
        }
    }

    public final MicrogramLaunchId getMicrogramLaunchId() {
        State state = this.state;
        if (state != null) {
            return state.getMicrogramLaunchId();
        }
        return null;
    }

    public final void setSource(MicrogramSource source, String discriminator, String launchArgument, boolean isDynamic) {
        Intrinsics.checkNotNullParameter(source, "source");
        State state = new State(new MicrogramLaunchId(source, discriminator), launchArgument, isDynamic);
        State state2 = this.state;
        if (state2 != null && !Intrinsics.areEqual(state2, state)) {
            throw new IllegalStateException(("State must have not yet been set or the same: " + this.state + " != " + state).toString());
        }
        if (this.state == null) {
            this.state = state;
            MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, getLifecycleScope(), state.getMicrogramLaunchId(), null, 4, null);
            RhTrace6 rhTrace6WithMethodNamePrefix = microgramManager2M16549getInstancemoChb0s$default.getComponent().getInstanceTrace().withMethodNamePrefix("EmbeddedSectionDuxo.");
            rhTrace6WithMethodNamePrefix.instant("setSource");
            this.trace = rhTrace6WithMethodNamePrefix;
            this.instanceDeferred.complete(microgramManager2M16549getInstancemoChb0s$default);
            getLifecycleScope().launchWhenStarted(new C218472(null));
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$setSource$2", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$setSource$2 */
    static final class C218472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C218472(Continuation<? super C218472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmbeddedSectionDuxo.this.new C218472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbeddedSectionDuxo embeddedSectionDuxo = EmbeddedSectionDuxo.this;
                this.label = 1;
                if (embeddedSectionDuxo.init(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.messageHandlerJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C218421(null), 3, null);
        getLifecycleScope().launchWhenStarted(new C218432(null));
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {98, 98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$1 */
    static final class C218421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C218421(Continuation<? super C218421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmbeddedSectionDuxo.this.new C218421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EmbeddedSectionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EmbeddedSectionDuxo $tmp0;

            AnonymousClass1(EmbeddedSectionDuxo embeddedSectionDuxo) {
                this.$tmp0 = embeddedSectionDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EmbeddedSectionDuxo.class, "emitMessage", "emitMessage(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(UiObject<? extends RouterMessage, RouterOutboundDto> uiObject, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$emitMessage = C218421.invokeSuspend$emitMessage(this.$tmp0, uiObject, continuation);
                return objInvokeSuspend$emitMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$emitMessage : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((UiObject<? extends RouterMessage, RouterOutboundDto>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r5.collect(r3, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbeddedSectionDuxo embeddedSectionDuxo = EmbeddedSectionDuxo.this;
                this.label = 1;
                obj = embeddedSectionDuxo.embeddedSectionView(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new ExceptionsH();
            }
            ResultKt.throwOnFailure(obj);
            SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> events = ((UiController.EmbeddedSectionView) obj).getEvents();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(EmbeddedSectionDuxo.this);
            this.label = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$emitMessage(EmbeddedSectionDuxo embeddedSectionDuxo, UiObject uiObject, Continuation continuation) {
            embeddedSectionDuxo.emitMessage((UiObject<? extends RouterMessage, RouterOutboundDto>) uiObject);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2 */
    static final class C218432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218432(Continuation<? super C218432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218432 c218432 = EmbeddedSectionDuxo.this.new C218432(continuation);
            c218432.L$0 = obj;
            return c218432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EmbeddedSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {103, 103}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EmbeddedSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EmbeddedSectionDuxo embeddedSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = embeddedSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EmbeddedSectionDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C502981 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ EmbeddedSectionDuxo $tmp0;

                C502981(EmbeddedSectionDuxo embeddedSectionDuxo) {
                    this.$tmp0 = embeddedSectionDuxo;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, EmbeddedSectionDuxo.class, "handleRender", "handleRender(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> uiObject, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleRender = AnonymousClass1.invokeSuspend$handleRender(this.$tmp0, uiObject, continuation);
                    return objInvokeSuspend$handleRender == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleRender : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
                if (r5.collect(r3, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EmbeddedSectionDuxo embeddedSectionDuxo = this.this$0;
                    this.label = 1;
                    obj = embeddedSectionDuxo.embeddedSectionView(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new ExceptionsH();
                }
                ResultKt.throwOnFailure(obj);
                SharedFlow<UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto>> state = ((UiController.EmbeddedSectionView) obj).getState();
                C502981 c502981 = new C502981(this.this$0);
                this.label = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleRender(EmbeddedSectionDuxo embeddedSectionDuxo, UiObject uiObject, Continuation continuation) {
                embeddedSectionDuxo.handleRender(uiObject);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass1(EmbeddedSectionDuxo.this, null), 3, null);
            Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass2(EmbeddedSectionDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: EmbeddedSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {107, 112}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EmbeddedSectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EmbeddedSectionDuxo embeddedSectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = embeddedSectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r6, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred completableDeferred = this.this$0.instanceDeferred;
                    this.label = 1;
                    obj = completableDeferred.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                final StateFlow<Monitoring> state = ((MicrogramManager2) obj).getComponent().getMicrogramMonitor().getState();
                Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$invokeSuspend$$inlined$filterIsInstance$1$2", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (obj instanceof Monitoring.Terminated) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object objCollect = state.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 2;
            }

            /* compiled from: EmbeddedSectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lmicrogram/android/MicrogramState$Terminated;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Monitoring.Terminated, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EmbeddedSectionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EmbeddedSectionDuxo embeddedSectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = embeddedSectionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Monitoring.Terminated terminated, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(terminated, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EmbeddedSectionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$1$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onCreate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502991 extends ContinuationImpl7 implements Function2<EmbeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4>, Object> {
                    final /* synthetic */ Monitoring.Terminated $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502991(Monitoring.Terminated terminated, Continuation<? super C502991> continuation) {
                        super(2, continuation);
                        this.$state = terminated;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C502991(this.$state, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EmbeddedSectionDuxo4 embeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4> continuation) {
                        return ((C502991) create(embeddedSectionDuxo4, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return new EmbeddedSectionDuxo4.Error(this.$state);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502991((Monitoring.Terminated) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object embeddedSectionView(Continuation<? super UiController.EmbeddedSectionView> continuation) {
        C218371 c218371;
        UiController uiController;
        if (continuation instanceof C218371) {
            c218371 = (C218371) continuation;
            int i = c218371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218371.label = i - Integer.MIN_VALUE;
            } else {
                c218371 = new C218371(continuation);
            }
        }
        Object objUiController = c218371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUiController);
            UiController.Companion companion = UiController.INSTANCE;
            CompletableDeferred<MicrogramManager2> completableDeferred = this.instanceDeferred;
            c218371.label = 1;
            objUiController = companion.uiController(completableDeferred, c218371);
            if (objUiController != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uiController = (UiController) c218371.L$0;
            ResultKt.throwOnFailure(objUiController);
            if (objUiController != null) {
                throw new IllegalStateException("Required value was null.");
            }
            UiObject uiObject = (UiObject) objUiController;
            State state = this.state;
            if (state != null && state.isDynamic()) {
                return uiController.dynamicEmbeddedSectionView(EmbeddedSectionResponse2.getIdentifier(uiObject));
            }
            return uiController.getSingletonEmbeddedSectionView();
        }
        ResultKt.throwOnFailure(objUiController);
        UiController uiController2 = (UiController) objUiController;
        CompletableDeferred<UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>> completableDeferred2 = this.startResponseDeferred;
        c218371.L$0 = uiController2;
        c218371.label = 2;
        Object objAwait = completableDeferred2.await(c218371);
        if (objAwait != coroutine_suspended) {
            uiController = uiController2;
            objUiController = objAwait;
            if (objUiController != null) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$handleRender$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$handleRender$1 */
    static final class C218381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218381(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> uiObject, Continuation<? super C218381> continuation) {
            super(2, continuation);
            this.$content = uiObject;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmbeddedSectionDuxo.this.new C218381(this.$content, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred completableDeferred = EmbeddedSectionDuxo.this.instanceDeferred;
                this.label = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EmbeddedSectionDuxo.this.applyMutation(new AnonymousClass1(this.$content, (MicrogramManager2) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EmbeddedSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/microgramsdui/EmbeddedSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$handleRender$1$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$handleRender$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EmbeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4>, Object> {
            final /* synthetic */ UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> $content;
            final /* synthetic */ MicrogramManager2 $instance;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> uiObject, MicrogramManager2 microgramManager2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = uiObject;
                this.$instance = microgramManager2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$content, this.$instance, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EmbeddedSectionDuxo4 embeddedSectionDuxo4, Continuation<? super EmbeddedSectionDuxo4> continuation) {
                return ((AnonymousClass1) create(embeddedSectionDuxo4, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new EmbeddedSectionDuxo4.Success(this.$content, this.$instance.getComponent().getResourceLoader());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRender(UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> content) {
        this.trace.instant("handleRender");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C218381(content, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:44:0x00ac, B:46:0x00b5, B:50:0x00bd, B:26:0x005f, B:38:0x008a, B:40:0x0090, B:62:0x00f0, B:63:0x00f7), top: B:69:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:44:0x00ac, B:46:0x00b5, B:50:0x00bd, B:26:0x005f, B:38:0x008a, B:40:0x0090, B:62:0x00f0, B:63:0x00f7), top: B:69:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:44:0x00ac, B:46:0x00b5, B:50:0x00bd, B:26:0x005f, B:38:0x008a, B:40:0x0090, B:62:0x00f0, B:63:0x00f7), top: B:69:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:14:0x0038, B:54:0x00d2, B:56:0x00de, B:57:0x00e6), top: B:74:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {all -> 0x0063, blocks: (B:44:0x00ac, B:46:0x00b5, B:50:0x00bd, B:26:0x005f, B:38:0x008a, B:40:0x0090, B:62:0x00f0, B:63:0x00f7), top: B:69:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object init(Continuation<? super Unit> continuation) throws Throwable {
        C218391 c218391;
        RhTrace3 rhTrace3;
        Throwable th;
        RhTrace3 rhTrace32;
        State state;
        MicrogramManager2 microgramManager2;
        UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto> uiObject;
        UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto> uiObject2;
        MicrogramManager2 microgramManager22;
        UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> uiObjectDecodeEmbeddedSectionContent;
        if (continuation instanceof C218391) {
            c218391 = (C218391) continuation;
            int i = c218391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c218391.label = i - Integer.MIN_VALUE;
            } else {
                c218391 = new C218391(continuation);
            }
        }
        Object obj = c218391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c218391.label;
        if (i2 != 0) {
            if (i2 == 1) {
                rhTrace32 = (RhTrace3) c218391.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    MicrogramManager2 microgramManager23 = (MicrogramManager2) obj;
                    state = this.state;
                    if (state != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    UiInitializer uiInitializer = microgramManager23.getUiInitializer();
                    String launchArgument = state.getLaunchArgument();
                    boolean zIsDynamic = state.isDynamic();
                    c218391.L$0 = rhTrace32;
                    c218391.L$1 = microgramManager23;
                    c218391.label = 2;
                    Object objStartEmbeddedSection = uiInitializer.startEmbeddedSection(launchArgument, zIsDynamic, c218391);
                    if (objStartEmbeddedSection == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    microgramManager2 = microgramManager23;
                    obj = objStartEmbeddedSection;
                    uiObject = (UiObject) obj;
                    this.startResponseDeferred.complete(uiObject);
                    if (uiObject != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    rhTrace3 = rhTrace32;
                }
            } else if (i2 == 2) {
                MicrogramManager2 microgramManager24 = (MicrogramManager2) c218391.L$1;
                RhTrace3 rhTrace33 = (RhTrace3) c218391.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    microgramManager2 = microgramManager24;
                    rhTrace32 = rhTrace33;
                    uiObject = (UiObject) obj;
                    this.startResponseDeferred.complete(uiObject);
                    if (uiObject != null) {
                        Unit unit = Unit.INSTANCE;
                        if (rhTrace32 != null) {
                            rhTrace32.end();
                        }
                        return unit;
                    }
                    UiController.Companion companion = UiController.INSTANCE;
                    c218391.L$0 = rhTrace32;
                    c218391.L$1 = microgramManager2;
                    c218391.L$2 = uiObject;
                    c218391.label = 3;
                    Object objUiController = companion.uiController(microgramManager2, c218391);
                    if (objUiController != coroutine_suspended) {
                        uiObject2 = uiObject;
                        obj = objUiController;
                        rhTrace3 = rhTrace32;
                        microgramManager22 = microgramManager2;
                        uiObjectDecodeEmbeddedSectionContent = ((UiController) obj).decodeEmbeddedSectionContent(EmbeddedSectionResponse2.getEncodedInitialContent(uiObject2));
                        if (uiObjectDecodeEmbeddedSectionContent != null) {
                        }
                        Unit unit2 = Unit.INSTANCE;
                        if (rhTrace3 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    rhTrace3 = rhTrace33;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiObject2 = (UiObject) c218391.L$2;
                microgramManager22 = (MicrogramManager2) c218391.L$1;
                rhTrace3 = (RhTrace3) c218391.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    uiObjectDecodeEmbeddedSectionContent = ((UiController) obj).decodeEmbeddedSectionContent(EmbeddedSectionResponse2.getEncodedInitialContent(uiObject2));
                    if (uiObjectDecodeEmbeddedSectionContent != null) {
                        applyMutation(new EmbeddedSectionDuxo2(uiObjectDecodeEmbeddedSectionContent, microgramManager22, null));
                    }
                    Unit unit22 = Unit.INSTANCE;
                    if (rhTrace3 != null) {
                        rhTrace3.end();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (rhTrace3 != null) {
                rhTrace3.end();
            }
            throw th;
        }
        ResultKt.throwOnFailure(obj);
        RhTrace6 rhTrace6 = this.trace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("init");
        try {
            CompletableDeferred<MicrogramManager2> completableDeferred = this.instanceDeferred;
            c218391.L$0 = rhTrace3BeginSpan;
            c218391.label = 1;
            Object objAwait = completableDeferred.await(c218391);
            if (objAwait != coroutine_suspended) {
                rhTrace32 = rhTrace3BeginSpan;
                obj = objAwait;
                MicrogramManager2 microgramManager232 = (MicrogramManager2) obj;
                state = this.state;
                if (state != null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            rhTrace3 = rhTrace3BeginSpan;
            th = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitMessage(UiObject<? extends RouterMessage, RouterOutboundDto> state) {
        if (state instanceof UiObject.Legacy) {
            emitMessage((RouterMessage) ((UiObject.Legacy) state).getValue());
        } else {
            if (!(state instanceof UiObject.Idl)) {
                throw new NoWhenBranchMatchedException();
            }
            emitMessage((RouterOutboundDto) ((UiObject.Idl) state).getValue());
        }
    }

    private final void emitMessage(RouterMessage state) {
        if (state instanceof RouterMessage.PresentAlert) {
            submit(new EmbeddedSectionDuxo3.PresentAlert(new UiObject.Legacy(((RouterMessage.PresentAlert) state).getAlertContent())));
            return;
        }
        if (state instanceof RouterMessage.PresentBottomSheet) {
            submit(new EmbeddedSectionDuxo3.PresentBottomSheet(((RouterMessage.PresentBottomSheet) state).getIdentifier()));
            return;
        }
        if (state instanceof RouterMessage.ShowRouter) {
            submit(new EmbeddedSectionDuxo3.PresentRouter(new UiObject.Legacy(((RouterMessage.ShowRouter) state).getData())));
            return;
        }
        if (state instanceof RouterMessage.OpenDeeplink) {
            RouterMessage.OpenDeeplink openDeeplink = (RouterMessage.OpenDeeplink) state;
            submit(new EmbeddedSectionDuxo3.OpenDeeplink(openDeeplink.getLink(), new UiObject.Legacy(openDeeplink.getNavigationType())));
            return;
        }
        if (state instanceof RouterMessage.PresentSystemDefaultShareLink) {
            submit(new EmbeddedSectionDuxo3.PresentSystemDefaultShareLink(((RouterMessage.PresentSystemDefaultShareLink) state).getLink()));
            return;
        }
        if (state instanceof RouterMessage.PresentSystemDefaultShareContents) {
            submit(new EmbeddedSectionDuxo3.PresentSystemDefaultShareLink(CollectionsKt.joinToString$default(((RouterMessage.PresentSystemDefaultShareContents) state).getContents(), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null)));
            return;
        }
        if (state instanceof RouterMessage.PresentToast) {
            submit(new EmbeddedSectionDuxo3.PresentToast(new UiObject.Legacy(((RouterMessage.PresentToast) state).getToastData())));
        } else if (!(state instanceof RouterMessage.DismissAll) && !(state instanceof RouterMessage.DismissBottomSheet) && !(state instanceof RouterMessage.DismissScreen) && !(state instanceof RouterMessage.PushScreen)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void emitMessage(RouterOutboundDto state) {
        RouterOutboundDto.ConcreteDto concrete = state.getConcrete();
        if (concrete instanceof RouterOutboundDto.ConcreteDto.OpenDeeplink) {
            RouterOutboundDto.ConcreteDto.OpenDeeplink openDeeplink = (RouterOutboundDto.ConcreteDto.OpenDeeplink) concrete;
            submit(new EmbeddedSectionDuxo3.OpenDeeplink(Uri.parse(openDeeplink.getValue().getLink()), new UiObject.Idl(openDeeplink.getValue().getNavigation_type())));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentAlert) {
            AlertDto alert = ((RouterOutboundDto.ConcreteDto.PresentAlert) concrete).getValue().getAlert();
            if (alert == null) {
                alert = AlertDto.INSTANCE.getZeroValue();
            }
            submit(new EmbeddedSectionDuxo3.PresentAlert(new UiObject.Idl(alert)));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentBottomSheet) {
            submit(new EmbeddedSectionDuxo3.PresentBottomSheet(((RouterOutboundDto.ConcreteDto.PresentBottomSheet) concrete).getValue().getIdentifier()));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareContents) {
            submit(new EmbeddedSectionDuxo3.PresentSystemDefaultShareLink(CollectionsKt.joinToString$default(((RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareContents) concrete).getValue().getContents(), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null)));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareLink) {
            submit(new EmbeddedSectionDuxo3.PresentSystemDefaultShareLink(((RouterOutboundDto.ConcreteDto.PresentSystemDefaultShareLink) concrete).getValue().getLink()));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.ShowRouter) {
            InitialScreenDataDto data = ((RouterOutboundDto.ConcreteDto.ShowRouter) concrete).getValue().getData();
            if (data == null) {
                data = InitialScreenDataDto.INSTANCE.getZeroValue();
            }
            submit(new EmbeddedSectionDuxo3.PresentRouter(new UiObject.Idl(data)));
            return;
        }
        if (concrete instanceof RouterOutboundDto.ConcreteDto.PresentToast) {
            ToastDto toast = ((RouterOutboundDto.ConcreteDto.PresentToast) concrete).getValue().getToast();
            if (toast == null) {
                toast = ToastDto.INSTANCE.getZeroValue();
            }
            submit(new EmbeddedSectionDuxo3.PresentToast(new UiObject.Idl(toast)));
            return;
        }
        if (!(concrete instanceof RouterOutboundDto.ConcreteDto.DismissAll) && !(concrete instanceof RouterOutboundDto.ConcreteDto.DismissScreen) && !(concrete instanceof RouterOutboundDto.ConcreteDto.PushScreen) && concrete != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;", "identifier", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onStateUpdated$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onStateUpdated$1 */
    static final class C218441 extends ContinuationImpl7 implements Function3<UiController, String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, ComponentState> $states;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C218441(Map<String, ? extends ComponentState> map, Continuation<? super C218441> continuation) {
            super(3, continuation);
            this.$states = map;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UiController uiController, String str, Continuation<? super Unit> continuation) {
            C218441 c218441 = new C218441(this.$states, continuation);
            c218441.L$0 = uiController;
            c218441.L$1 = str;
            return c218441.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = (String) this.L$1;
                Map<String, ComponentState> map = this.$states;
                this.L$0 = null;
                this.label = 1;
                if (uiController.notifyScreenStatesUpdated(str, map, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onStateUpdated(Map<String, ? extends ComponentState> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        submitRouterEvent(new C218441(states, null));
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;", "identifier", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onAction$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onAction$1 */
    static final class C218411 extends ContinuationImpl7 implements Function3<UiController, String, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $action;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218411(MicrogramAction microgramAction, Continuation<? super C218411> continuation) {
            super(3, continuation);
            this.$action = microgramAction;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UiController uiController, String str, Continuation<? super Unit> continuation) {
            C218411 c218411 = new C218411(this.$action, continuation);
            c218411.L$0 = uiController;
            c218411.L$1 = str;
            return c218411.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UiController uiController = (UiController) this.L$0;
                String str = (String) this.L$1;
                String identifier = this.$action.getIdentifier();
                this.L$0 = null;
                this.label = 1;
                if (uiController.notifyScreenActionTriggered(str, identifier, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onAction(MicrogramAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        submitRouterEvent(new C218411(action, null));
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onToastAction$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onToastAction$1 */
    static final class C218451 extends ContinuationImpl7 implements Function3<UiController, String, Continuation<? super Unit>, Object> {
        final /* synthetic */ MicrogramAction $action;
        final /* synthetic */ String $toastId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218451(String str, MicrogramAction microgramAction, Continuation<? super C218451> continuation) {
            super(3, continuation);
            this.$toastId = str;
            this.$action = microgramAction;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UiController uiController, String str, Continuation<? super Unit> continuation) {
            C218451 c218451 = EmbeddedSectionDuxo.this.new C218451(this.$toastId, this.$action, continuation);
            c218451.L$0 = uiController;
            return c218451.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r7 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        
            if (r1.notifyRouterToastActionTriggered(r7, r3, r4, r6) != r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiController uiController;
            String identifier;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                uiController = (UiController) this.L$0;
                State state = EmbeddedSectionDuxo.this.state;
                if (state != null && state.isDynamic()) {
                    CompletableDeferred completableDeferred = EmbeddedSectionDuxo.this.startResponseDeferred;
                    this.L$0 = uiController;
                    this.label = 1;
                    obj = completableDeferred.await(this);
                } else {
                    identifier = "embedded-section-router";
                    String str = this.$toastId;
                    String identifier2 = this.$action.getIdentifier();
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                uiController = (UiController) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            identifier = EmbeddedSectionResponse2.getIdentifier((UiObject) obj);
            String str2 = this.$toastId;
            String identifier22 = this.$action.getIdentifier();
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final void onToastAction(String toastId, MicrogramAction action) {
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        Intrinsics.checkNotNullParameter(action, "action");
        submitRouterEvent(new C218451(toastId, action, null));
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/microgramsdui/control/UiController;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onToastDismissed$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$onToastDismissed$1 */
    static final class C218461 extends ContinuationImpl7 implements Function3<UiController, String, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $toastId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218461(String str, Continuation<? super C218461> continuation) {
            super(3, continuation);
            this.$toastId = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(UiController uiController, String str, Continuation<? super Unit> continuation) {
            C218461 c218461 = EmbeddedSectionDuxo.this.new C218461(this.$toastId, continuation);
            c218461.L$0 = uiController;
            return c218461.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r6 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        
            if (r1.notifyRouterToastDismissed(r6, r3, r5) != r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiController uiController;
            String identifier;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                uiController = (UiController) this.L$0;
                State state = EmbeddedSectionDuxo.this.state;
                if (state != null && state.isDynamic()) {
                    CompletableDeferred completableDeferred = EmbeddedSectionDuxo.this.startResponseDeferred;
                    this.L$0 = uiController;
                    this.label = 1;
                    obj = completableDeferred.await(this);
                } else {
                    identifier = "embedded-section-router";
                    String str = this.$toastId;
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                uiController = (UiController) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            identifier = EmbeddedSectionResponse2.getIdentifier((UiObject) obj);
            String str2 = this.$toastId;
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final void onToastDismissed(String toastId) {
        Intrinsics.checkNotNullParameter(toastId, "toastId");
        submitRouterEvent(new C218461(toastId, null));
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$submitRouterEvent$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$submitRouterEvent$1 */
    static final class C218481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<UiController, String, Continuation<? super Unit>, Object> $block;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C218481(Function3<? super UiController, ? super String, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C218481> continuation) {
            super(2, continuation);
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmbeddedSectionDuxo.this.new C218481(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            if (r1.invoke(r8, r3, r7) != r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MicrogramManager2 microgramManager2;
            UiObject uiObject;
            String identifier;
            State state;
            Object objUiController;
            String str;
            Function3 function3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred completableDeferred = EmbeddedSectionDuxo.this.instanceDeferred;
                this.label = 1;
                obj = completableDeferred.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    microgramManager2 = (MicrogramManager2) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    uiObject = (UiObject) obj;
                    if (uiObject != null && (identifier = EmbeddedSectionResponse2.getIdentifier(uiObject)) != null) {
                        EmbeddedSectionDuxo embeddedSectionDuxo = EmbeddedSectionDuxo.this;
                        Function3<UiController, String, Continuation<? super Unit>, Object> function32 = this.$block;
                        state = embeddedSectionDuxo.state;
                        if (state != null && state.isDynamic()) {
                            identifier = identifier + "_section";
                        }
                        UiController.Companion companion = UiController.INSTANCE;
                        this.L$0 = identifier;
                        this.L$1 = function32;
                        this.label = 3;
                        objUiController = companion.uiController(microgramManager2, this);
                        if (objUiController != coroutine_suspended) {
                            str = identifier;
                            obj = objUiController;
                            function3 = function32;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                function3 = (Function3) this.L$1;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
            microgramManager2 = (MicrogramManager2) obj;
            CompletableDeferred completableDeferred2 = EmbeddedSectionDuxo.this.startResponseDeferred;
            this.L$0 = microgramManager2;
            this.label = 2;
            obj = completableDeferred2.await(this);
            if (obj != coroutine_suspended) {
                uiObject = (UiObject) obj;
                if (uiObject != null) {
                    EmbeddedSectionDuxo embeddedSectionDuxo2 = EmbeddedSectionDuxo.this;
                    Function3<UiController, String, Continuation<? super Unit>, Object> function322 = this.$block;
                    state = embeddedSectionDuxo2.state;
                    if (state != null) {
                        identifier = identifier + "_section";
                    }
                    UiController.Companion companion2 = UiController.INSTANCE;
                    this.L$0 = identifier;
                    this.L$1 = function322;
                    this.label = 3;
                    objUiController = companion2.uiController(microgramManager2, this);
                    if (objUiController != coroutine_suspended) {
                    }
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private final void submitRouterEvent(Function3<? super UiController, ? super String, ? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C218481(block, null), 3, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onDestroy() {
        super.onDestroy();
        Job job = this.messageHandlerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        notifyRouterTornDown();
    }

    /* compiled from: EmbeddedSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$notifyRouterTornDown$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$notifyRouterTornDown$1 */
    static final class C218401 extends ContinuationImpl7 implements Function2<MicrogramManager2, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C218401(Continuation<? super C218401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218401 c218401 = EmbeddedSectionDuxo.this.new C218401(continuation);
            c218401.L$0 = obj;
            return c218401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MicrogramManager2 microgramManager2, Continuation<? super Unit> continuation) {
            return ((C218401) create(microgramManager2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MicrogramManager2 microgramManager2 = (MicrogramManager2) this.L$0;
                if (EmbeddedSectionDuxo.this.startResponseDeferred.isCompleted()) {
                    UiObject uiObject = (UiObject) EmbeddedSectionDuxo.this.startResponseDeferred.getCompleted();
                    if (uiObject != null) {
                        BuildersKt__Builders_commonKt.launch$default(microgramManager2.getComponent().getCoroutineScope(), null, null, new AnonymousClass1(microgramManager2, uiObject, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EmbeddedSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$notifyRouterTornDown$1$1", m3645f = "EmbeddedSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.microgramsdui.EmbeddedSectionDuxo$notifyRouterTornDown$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MicrogramManager2 $instance;
            final /* synthetic */ UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto> $startResponse;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MicrogramManager2 microgramManager2, UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto> uiObject, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instance = microgramManager2;
                this.$startResponse = uiObject;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$instance, this.$startResponse, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
            
                if (((com.robinhood.android.microgramsdui.control.UiController) r5).notifyRouterTornDown(r1, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    UiController.Companion companion = UiController.INSTANCE;
                    MicrogramManager2 microgramManager2 = this.$instance;
                    this.label = 1;
                    obj = companion.uiController(microgramManager2, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                String identifier = EmbeddedSectionResponse2.getIdentifier(this.$startResponse);
                this.label = 2;
            }
        }
    }

    private final void notifyRouterTornDown() {
        Lifecycle5.performCleanupAsync(this.instanceDeferred, new C218401(null));
    }
}
