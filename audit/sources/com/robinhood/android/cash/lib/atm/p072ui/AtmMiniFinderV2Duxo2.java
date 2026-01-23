package com.robinhood.android.cash.lib.atm.p072ui;

import android.location.Location;
import com.robinhood.android.cash.lib.atm.extensions.Locations2;
import com.robinhood.models.api.minerva.Atm;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AtmMiniFinderV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamAtms$2$1", m3645f = "AtmMiniFinderV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cash.lib.atm.ui.AtmMiniFinderV2Duxo$streamAtms$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AtmMiniFinderV2Duxo2 extends ContinuationImpl7 implements Function2<AtmMiniFinderDataState, Continuation<? super AtmMiniFinderDataState>, Object> {
    final /* synthetic */ List<Atm> $atmList;
    final /* synthetic */ Location $location;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AtmMiniFinderV2Duxo2(List<Atm> list, Location location, Continuation<? super AtmMiniFinderV2Duxo2> continuation) {
        super(2, continuation);
        this.$atmList = list;
        this.$location = location;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AtmMiniFinderV2Duxo2 atmMiniFinderV2Duxo2 = new AtmMiniFinderV2Duxo2(this.$atmList, this.$location, continuation);
        atmMiniFinderV2Duxo2.L$0 = obj;
        return atmMiniFinderV2Duxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AtmMiniFinderDataState atmMiniFinderDataState, Continuation<? super AtmMiniFinderDataState> continuation) {
        return ((AtmMiniFinderV2Duxo2) create(atmMiniFinderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((AtmMiniFinderDataState) this.L$0).copy(this.$atmList, Locations2.toLatLng(this.$location));
    }
}
