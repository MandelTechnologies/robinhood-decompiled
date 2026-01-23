package com.robinhood.android.common.portfolio.position;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$10$1", m3645f = "SwipeRow.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$10$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SwipeRow4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableMap<SwipeToDismiss3, Function0<Unit>> $actions;
    final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $alert$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $isRowResetting$delegate;
    final /* synthetic */ Function1<EventLogger, Unit> $logOnSwipeLeft;
    final /* synthetic */ Function1<EventLogger, Unit> $logOnSwipeRight;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function1<String, Unit> $onAlertWithReceiptDismissed;
    final /* synthetic */ SnapshotState<Boolean> $showSpinner$delegate;
    final /* synthetic */ Map<SwipeToDismiss3, PositionSwipeBehavior> $values;
    int label;

    /* compiled from: SwipeRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$10$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeToDismiss3.values().length];
            try {
                iArr[SwipeToDismiss3.DismissedToEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeToDismiss3.DismissedToStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeRow4(ImmutableMap<SwipeToDismiss3, ? extends Function0<Unit>> immutableMap, SwipeToDismiss2 swipeToDismiss2, Map<SwipeToDismiss3, PositionSwipeBehavior> map, Function1<? super EventLogger, Unit> function1, EventLogger eventLogger, Function1<? super EventLogger, Unit> function12, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<GenericAlertContent<GenericAction>> snapshotState3, Function1<? super String, Unit> function13, Continuation<? super SwipeRow4> continuation) {
        super(2, continuation);
        this.$actions = immutableMap;
        this.$dismissState = swipeToDismiss2;
        this.$values = map;
        this.$logOnSwipeRight = function1;
        this.$eventLogger = eventLogger;
        this.$logOnSwipeLeft = function12;
        this.$navigator = navigator;
        this.$context = context;
        this.$isRowResetting$delegate = snapshotState;
        this.$showSpinner$delegate = snapshotState2;
        this.$alert$delegate = snapshotState3;
        this.$onAlertWithReceiptDismissed = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeRow4(this.$actions, this.$dismissState, this.$values, this.$logOnSwipeRight, this.$eventLogger, this.$logOnSwipeLeft, this.$navigator, this.$context, this.$isRowResetting$delegate, this.$showSpinner$delegate, this.$alert$delegate, this.$onAlertWithReceiptDismissed, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeRow4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        Function1<String, Unit> function1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (SwipeRow3.SwipeRow$lambda$16(this.$isRowResetting$delegate)) {
                return Unit.INSTANCE;
            }
            Function0<Unit> function0 = this.$actions.get(this.$dismissState.getCurrentValue());
            PositionSwipeBehavior positionSwipeBehavior = this.$values.get(this.$dismissState.getCurrentValue());
            int i = WhenMappings.$EnumSwitchMapping$0[this.$dismissState.getCurrentValue().ordinal()];
            if (i == 1) {
                this.$logOnSwipeRight.invoke(this.$eventLogger);
            } else if (i == 2) {
                this.$logOnSwipeLeft.invoke(this.$eventLogger);
            }
            if (function0 != null) {
                function0.invoke();
                SwipeRow3.SwipeRow$lambda$11(this.$showSpinner$delegate, true);
                return Unit.INSTANCE;
            }
            if (positionSwipeBehavior == null || this.$navigator == null) {
                return Unit.INSTANCE;
            }
            String deeplink = positionSwipeBehavior.getDeeplink();
            if (positionSwipeBehavior.getAlert() != null) {
                this.$alert$delegate.setValue(positionSwipeBehavior.getAlert());
                String alertIacReceiptId = positionSwipeBehavior.getAlertIacReceiptId();
                if (alertIacReceiptId != null && (function1 = this.$onAlertWithReceiptDismissed) != null) {
                    function1.invoke(alertIacReceiptId);
                }
                SwipeRow3.SwipeRow$lambda$17(this.$isRowResetting$delegate, true);
            } else if (deeplink != null) {
                try {
                    uri = Uri.parse(deeplink);
                } catch (Exception unused) {
                    uri = null;
                }
                Uri uri2 = uri;
                if (uri2 != null) {
                    Navigator.DefaultImpls.handleDeepLink$default(this.$navigator, this.$context, uri2, null, null, false, null, 44, null);
                    SwipeRow3.SwipeRow$lambda$11(this.$showSpinner$delegate, true);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
