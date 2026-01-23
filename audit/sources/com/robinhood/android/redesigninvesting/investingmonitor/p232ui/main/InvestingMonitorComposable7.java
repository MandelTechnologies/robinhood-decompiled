package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorViewState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: InvestingMonitorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3$1$1", m3645f = "InvestingMonitorComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $pageIdx;
    final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;
    final /* synthetic */ InvestingMonitorViewState.Loaded $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorComposable7(ImmutableList3<InvestingMonitorPage> immutableList3, int i, InvestingMonitorViewState.Loaded loaded, Continuation<? super InvestingMonitorComposable7> continuation) {
        super(2, continuation);
        this.$pages = immutableList3;
        this.$pageIdx = i;
        this.$viewState = loaded;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorComposable7(this.$pages, this.$pageIdx, this.$viewState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Timber.Companion companion = Timber.INSTANCE;
        String tabTitle = this.$pages.get(this.$pageIdx).getTabTitle();
        ImmutableList3<InvestingMonitorAsset> assets = this.$viewState.getPages().get(this.$pageIdx).getAssets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
        Iterator<InvestingMonitorAsset> it = assets.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSymbol());
        }
        companion.mo3350d("🔁 Pager lambda recomposed " + tabTitle + ": " + arrayList, new Object[0]);
        return Unit.INSTANCE;
    }
}
