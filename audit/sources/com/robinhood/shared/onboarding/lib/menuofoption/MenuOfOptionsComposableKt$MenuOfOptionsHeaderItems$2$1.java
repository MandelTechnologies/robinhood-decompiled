package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1", m3645f = "MenuOfOptionsComposable.kt", m3646l = {514}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes6.dex */
final class MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ ImmutableList<MenuOfOptionsPathItem> $pathItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1(ImmutableList<MenuOfOptionsPathItem> immutableList, LazyListState lazyListState, Continuation<? super MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1> continuation) {
        super(2, continuation);
        this.$pathItems = immutableList;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1(this.$pathItems, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MenuOfOptionsComposableKt$MenuOfOptionsHeaderItems$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator<MenuOfOptionsPathItem> it = this.$pathItems.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().getFeatured()) {
                    break;
                }
                i2++;
            }
            Integer numBoxInt = boxing.boxInt(i2);
            if (numBoxInt.intValue() == -1) {
                numBoxInt = null;
            }
            if (numBoxInt != null) {
                LazyListState lazyListState = this.$listState;
                int iIntValue = numBoxInt.intValue();
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, iIntValue, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
