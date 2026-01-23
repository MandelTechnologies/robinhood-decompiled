package com.robinhood.compose.bento.util;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotState;
import androidx.lifecycle.Lifecycle;
import com.robinhood.compose.bento.util.AppearanceUtil;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppearanceUtil.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$3$1", m3645f = "AppearanceUtil.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$3$1, reason: use source file name */
/* loaded from: classes15.dex */
final class AppearanceUtil4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isVisible$delegate;
    final /* synthetic */ SnapshotState<LayoutCoordinates> $lastCoordinates$delegate;
    final /* synthetic */ SnapshotLongState2 $lastVisibilityCheckTimestamp$delegate;
    final /* synthetic */ SnapshotState<Lifecycle.Event> $lifecycleEvent$delegate;
    final /* synthetic */ Rect $rect;
    final /* synthetic */ View $view;
    int label;

    /* compiled from: AppearanceUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.util.AppearanceUtilKt$onAppear$1$3$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppearanceUtil4(View view, Rect rect, SnapshotState<LayoutCoordinates> snapshotState, SnapshotState<Lifecycle.Event> snapshotState2, SnapshotLongState2 snapshotLongState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AppearanceUtil4> continuation) {
        super(2, continuation);
        this.$view = view;
        this.$rect = rect;
        this.$lastCoordinates$delegate = snapshotState;
        this.$lifecycleEvent$delegate = snapshotState2;
        this.$lastVisibilityCheckTimestamp$delegate = snapshotLongState2;
        this.$isVisible$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppearanceUtil4(this.$view, this.$rect, this.$lastCoordinates$delegate, this.$lifecycleEvent$delegate, this.$lastVisibilityCheckTimestamp$delegate, this.$isVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppearanceUtil4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Lifecycle.Event eventInvoke$lambda$10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LayoutCoordinates layoutCoordinatesInvoke$lambda$7 = AppearanceUtil.C326571.invoke$lambda$7(this.$lastCoordinates$delegate);
            if (layoutCoordinatesInvoke$lambda$7 != null && (eventInvoke$lambda$10 = AppearanceUtil.C326571.invoke$lambda$10(this.$lifecycleEvent$delegate)) != null) {
                switch (WhenMappings.$EnumSwitchMapping$0[eventInvoke$lambda$10.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.$lastVisibilityCheckTimestamp$delegate.getLongValue() > 250) {
                            boolean zIsVisible = LayoutCoordinates3.isVisible(layoutCoordinatesInvoke$lambda$7, this.$view, this.$rect);
                            SnapshotState<Boolean> snapshotState = this.$isVisible$delegate;
                            SnapshotLongState2 snapshotLongState2 = this.$lastVisibilityCheckTimestamp$delegate;
                            AppearanceUtil.C326571.invoke$lambda$2(snapshotState, zIsVisible);
                            snapshotLongState2.setLongValue(jCurrentTimeMillis);
                            break;
                        }
                        break;
                    case 6:
                    case 7:
                        AppearanceUtil.C326571.invoke$lambda$2(this.$isVisible$delegate, false);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
