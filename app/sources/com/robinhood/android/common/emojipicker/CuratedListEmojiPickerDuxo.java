package com.robinhood.android.common.emojipicker;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListEmojiPickerDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerViewState;", "emojiProvider", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/common/emojipicker/CuratedListEmojiProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "expandEmojiGroup", "key", "", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CuratedListEmojiPickerDuxo extends BaseDuxo4<CuratedListEmojiPickerViewState> {
    public static final int $stable = 8;
    private final CuratedListEmojiProvider emojiProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListEmojiPickerDuxo(CuratedListEmojiProvider emojiProvider, DuxoBundle duxoBundle) {
        super(new CuratedListEmojiPickerViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(emojiProvider, "emojiProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.emojiProvider = emojiProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.emojiProvider.getEmojiGroups(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListEmojiPickerDuxo.onCreate$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo, List emojiGroups) {
        Intrinsics.checkNotNullParameter(emojiGroups, "emojiGroups");
        curatedListEmojiPickerDuxo.applyMutation(new CuratedListEmojiPickerDuxo2(emojiGroups, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListEmojiPickerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.emojipicker.CuratedListEmojiPickerDuxo$expandEmojiGroup$1", m3645f = "CuratedListEmojiPickerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerDuxo$expandEmojiGroup$1 */
    static final class C111421 extends ContinuationImpl7 implements Function2<CuratedListEmojiPickerViewState, Continuation<? super CuratedListEmojiPickerViewState>, Object> {
        final /* synthetic */ String $key;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C111421(String str, Continuation<? super C111421> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C111421 c111421 = new C111421(this.$key, continuation);
            c111421.L$0 = obj;
            return c111421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CuratedListEmojiPickerViewState curatedListEmojiPickerViewState, Continuation<? super CuratedListEmojiPickerViewState> continuation) {
            return ((C111421) create(curatedListEmojiPickerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CuratedListEmojiPickerViewState curatedListEmojiPickerViewState = (CuratedListEmojiPickerViewState) this.L$0;
            return CuratedListEmojiPickerViewState.copy$default(curatedListEmojiPickerViewState, null, SetsKt.plus(curatedListEmojiPickerViewState.getExpandedGroupLabels(), this.$key), 1, null);
        }
    }

    public final void expandEmojiGroup(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        applyMutation(new C111421(key, null));
    }
}
