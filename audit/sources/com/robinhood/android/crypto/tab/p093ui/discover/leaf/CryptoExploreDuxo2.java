package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoExploreDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "query", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$searchFlow$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$searchFlow$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoExploreDuxo2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoExploreDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreDuxo2(CryptoExploreDuxo cryptoExploreDuxo, Continuation<? super CryptoExploreDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoExploreDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoExploreDuxo2 cryptoExploreDuxo2 = new CryptoExploreDuxo2(this.this$0, continuation);
        cryptoExploreDuxo2.L$0 = obj;
        return cryptoExploreDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((CryptoExploreDuxo2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$searchFlow$1$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$searchFlow$1$1 */
    static final class C131311 extends ContinuationImpl7 implements Function2<CryptoExploreViewState, Continuation<? super CryptoExploreViewState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131311(String str, Continuation<? super C131311> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131311 c131311 = new C131311(this.$query, continuation);
            c131311.L$0 = obj;
            return c131311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoExploreViewState cryptoExploreViewState, Continuation<? super CryptoExploreViewState> continuation) {
            return ((C131311) create(cryptoExploreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoExploreViewState cryptoExploreViewState = (CryptoExploreViewState) this.L$0;
            ImmutableList<CryptoTradingOptions.TradingOptionItem> searchOptionItems = cryptoExploreViewState.getSearchOptionItems();
            ImmutableList3 immutableList3 = null;
            if (searchOptionItems != null) {
                String str = this.$query;
                ArrayList arrayList = new ArrayList();
                for (CryptoTradingOptions.TradingOptionItem tradingOptionItem : searchOptionItems) {
                    CryptoTradingOptions.TradingOptionItem tradingOptionItem2 = tradingOptionItem;
                    if (StringsKt.contains((CharSequence) tradingOptionItem2.getTitle(), (CharSequence) str, true) || StringsKt.contains((CharSequence) tradingOptionItem2.getSubtitle(), (CharSequence) str, true)) {
                        arrayList.add(tradingOptionItem);
                    }
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                if (persistentList != null && !persistentList.isEmpty()) {
                    immutableList3 = persistentList;
                }
            }
            return CryptoExploreViewState.copy$default(cryptoExploreViewState, false, immutableList3, null, 0, null, null, 61, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C131311((String) this.L$0, null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
