package com.robinhood.android.settings.p254ui.notification;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.settings.p254ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationSettingsMultipleChoiceBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$1$1", m3645f = "NotificationSettingsMultipleChoiceBottomSheetComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.settings.ui.notification.NotificationSettingsMultipleChoiceBottomSheetComposableKt$NotificationSettingsMultipleChoiceBottomSheet$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class NotificationSettingsMultipleChoiceBottomSheetComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Set<String>, Unit> $onSelectedValuesChanged;
    final /* synthetic */ SnapshotState<Set<String>> $selectedValuesSet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NotificationSettingsMultipleChoiceBottomSheetComposable2(Function1<? super Set<String>, Unit> function1, SnapshotState<Set<String>> snapshotState, Continuation<? super NotificationSettingsMultipleChoiceBottomSheetComposable2> continuation) {
        super(2, continuation);
        this.$onSelectedValuesChanged = function1;
        this.$selectedValuesSet$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationSettingsMultipleChoiceBottomSheetComposable2(this.$onSelectedValuesChanged, this.$selectedValuesSet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationSettingsMultipleChoiceBottomSheetComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onSelectedValuesChanged.invoke(NotificationSettingsMultipleChoiceBottomSheetComposable.C284081.invoke$lambda$2(this.$selectedValuesSet$delegate));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
