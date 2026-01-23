package com.robinhood.android.common.emojipicker;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CuratedListEmojiPickerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.emojipicker.CuratedListEmojiPickerDuxo$onCreate$1$1", m3645f = "CuratedListEmojiPickerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CuratedListEmojiPickerDuxo2 extends ContinuationImpl7 implements Function2<CuratedListEmojiPickerViewState, Continuation<? super CuratedListEmojiPickerViewState>, Object> {
    final /* synthetic */ List<EmojiGroup> $emojiGroups;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListEmojiPickerDuxo2(List<EmojiGroup> list, Continuation<? super CuratedListEmojiPickerDuxo2> continuation) {
        super(2, continuation);
        this.$emojiGroups = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CuratedListEmojiPickerDuxo2 curatedListEmojiPickerDuxo2 = new CuratedListEmojiPickerDuxo2(this.$emojiGroups, continuation);
        curatedListEmojiPickerDuxo2.L$0 = obj;
        return curatedListEmojiPickerDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, Continuation<? super CuratedListEmojiPickerViewState> continuation) {
        return ((CuratedListEmojiPickerDuxo2) create(curatedListEmojiPickerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CuratedListEmojiPickerViewState.copy$default((CuratedListEmojiPickerViewState) this.L$0, extensions2.toImmutableList(this.$emojiGroups), null, 2, null);
    }
}
