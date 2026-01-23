package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BracketNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u000fJ\u000e\u00103\u001a\u0002002\u0006\u00102\u001a\u00020\u000fJ\u0010\u00104\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0007H\u0007J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u00101\u001a\u00020\u0007H\u0007J\u0016\u00105\u001a\u0002002\u0006\u00101\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007J\u0006\u00107\u001a\u000200J\u001a\u00108\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e09J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110;R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\"\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010 R\u001d\u0010'\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001d\u0010,\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b-\u0010)¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationState;", "", "navigationInfo", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "<init>", "(Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;)V", "key", "", "getKey", "()I", "numberOfRounds", "getNumberOfRounds", "newBracketLocationFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "", "isMovingToNewBracketLocation", "", "()Z", "availableRounds", "Lkotlinx/collections/immutable/ImmutableList;", "", "getAvailableRounds", "()Lkotlinx/collections/immutable/ImmutableList;", "availableRegions", "Lkotlinx/collections/immutable/PersistentList;", "getAvailableRegions", "()Lkotlinx/collections/immutable/PersistentList;", "<set-?>", "currentRoundIndex", "getCurrentRoundIndex", "setCurrentRoundIndex", "(I)V", "currentRoundIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "currentRegionIndex", "getCurrentRegionIndex", "setCurrentRegionIndex", "currentRegionIndex$delegate", "currentRegion", "getCurrentRegion", "()Ljava/lang/String;", "currentRegion$delegate", "Landroidx/compose/runtime/State;", "currentRoundName", "getCurrentRoundName", "currentRoundName$delegate", "onCurrentRoundIndexChange", "", "roundIndex", "currentYPercentage", "onCurrentRegionChange", "roundHasRegions", "moveToNewBracketLocation", "regionIndex", "onNewLocationMoved", "streamLocationChangeRequests", "Lkotlinx/coroutines/flow/StateFlow;", "streamNoLocationChangeInProgress", "Lkotlinx/coroutines/flow/Flow;", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState, reason: use source file name */
/* loaded from: classes3.dex */
public final class BracketNavigationInfo3 {
    public static final int $stable = 0;
    private final ImmutableList<String> availableRounds;

    /* renamed from: currentRegion$delegate, reason: from kotlin metadata */
    private final SnapshotState4 currentRegion;

    /* renamed from: currentRegionIndex$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 currentRegionIndex;

    /* renamed from: currentRoundIndex$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 currentRoundIndex;

    /* renamed from: currentRoundName$delegate, reason: from kotlin metadata */
    private final SnapshotState4 currentRoundName;
    private final int key;
    private final BracketNavigationInfo navigationInfo;
    private final StateFlow2<Tuples2<Integer, Float>> newBracketLocationFlow;
    private final int numberOfRounds;

    public BracketNavigationInfo3(BracketNavigationInfo navigationInfo) {
        Intrinsics.checkNotNullParameter(navigationInfo, "navigationInfo");
        this.navigationInfo = navigationInfo;
        this.key = navigationInfo.hashCode();
        this.numberOfRounds = navigationInfo.getNumberOfRounds();
        this.newBracketLocationFlow = StateFlow4.MutableStateFlow(null);
        this.availableRounds = navigationInfo.availableRoundsNames();
        this.currentRoundIndex = SnapshotIntState3.mutableIntStateOf(0);
        this.currentRegionIndex = SnapshotIntState3.mutableIntStateOf(0);
        this.currentRegion = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BracketNavigationInfo3.currentRegion_delegate$lambda$0(this.f$0);
            }
        });
        this.currentRoundName = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BracketNavigationInfo3.currentRoundName_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final int getKey() {
        return this.key;
    }

    public final int getNumberOfRounds() {
        return this.numberOfRounds;
    }

    private final boolean isMovingToNewBracketLocation() {
        return this.newBracketLocationFlow.getValue() != null;
    }

    public final ImmutableList<String> getAvailableRounds() {
        return this.availableRounds;
    }

    public final ImmutableList3<String> getAvailableRegions() {
        return this.navigationInfo.getRegions();
    }

    private final void setCurrentRoundIndex(int i) {
        this.currentRoundIndex.setIntValue(i);
    }

    public final int getCurrentRoundIndex() {
        return this.currentRoundIndex.getIntValue();
    }

    private final void setCurrentRegionIndex(int i) {
        this.currentRegionIndex.setIntValue(i);
    }

    public final int getCurrentRegionIndex() {
        return this.currentRegionIndex.getIntValue();
    }

    public final String getCurrentRegion() {
        return (String) this.currentRegion.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String currentRegion_delegate$lambda$0(BracketNavigationInfo3 bracketNavigationInfo3) {
        return bracketNavigationInfo3.navigationInfo.currentRegionName(bracketNavigationInfo3.getCurrentRoundIndex(), bracketNavigationInfo3.getCurrentRegionIndex());
    }

    public final String getCurrentRoundName() {
        return (String) this.currentRoundName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String currentRoundName_delegate$lambda$1(BracketNavigationInfo3 bracketNavigationInfo3) {
        return bracketNavigationInfo3.navigationInfo.currentRoundName(bracketNavigationInfo3.getCurrentRoundIndex());
    }

    public final void onCurrentRoundIndexChange(int roundIndex, float currentYPercentage) {
        if (isMovingToNewBracketLocation()) {
            return;
        }
        setCurrentRoundIndex(roundIndex);
        Integer numCurrentRegionIndex = this.navigationInfo.currentRegionIndex(roundIndex, currentYPercentage);
        if (numCurrentRegionIndex != null) {
            setCurrentRegionIndex(numCurrentRegionIndex.intValue());
        }
    }

    public final void onCurrentRegionChange(float currentYPercentage) {
        Integer numCurrentRegionIndex;
        if (isMovingToNewBracketLocation() || (numCurrentRegionIndex = this.navigationInfo.currentRegionIndex(getCurrentRoundIndex(), currentYPercentage)) == null) {
            return;
        }
        setCurrentRegionIndex(numCurrentRegionIndex.intValue());
    }

    public final boolean roundHasRegions(int roundIndex) {
        return this.navigationInfo.currentRoundHasRegions(roundIndex);
    }

    public final ImmutableList<String> availableRegions(int roundIndex) {
        if (roundHasRegions(roundIndex)) {
            return this.navigationInfo.getRegions();
        }
        return extensions2.persistentListOf();
    }

    public final void moveToNewBracketLocation(int roundIndex, int regionIndex) {
        this.newBracketLocationFlow.setValue(Tuples4.m3642to(Integer.valueOf(roundIndex), Float.valueOf(this.navigationInfo.getRegionTargetPercentage(roundIndex, regionIndex))));
        setCurrentRoundIndex(roundIndex);
        setCurrentRegionIndex(regionIndex);
    }

    public final void onNewLocationMoved() {
        this.newBracketLocationFlow.setValue(null);
    }

    public final StateFlow<Tuples2<Integer, Float>> streamLocationChangeRequests() {
        return FlowKt.asStateFlow(this.newBracketLocationFlow);
    }

    public final Flow<Boolean> streamNoLocationChangeInProgress() {
        final StateFlow2<Tuples2<Integer, Float>> stateFlow2 = this.newBracketLocationFlow;
        return new Flow<Boolean>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$streamNoLocationChangeInProgress$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$streamNoLocationChangeInProgress$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$streamNoLocationChangeInProgress$$inlined$map$1$2", m3645f = "BracketNavigationInfo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketNavigationState$streamNoLocationChangeInProgress$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Tuples2) obj) == null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
        };
    }
}
