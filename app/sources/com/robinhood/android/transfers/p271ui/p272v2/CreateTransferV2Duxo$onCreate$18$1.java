package com.robinhood.android.transfers.p271ui.p272v2;

import android.net.Uri;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Event;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$18$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {556}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$onCreate$18$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferV2DataState $dataState;
    final /* synthetic */ MAXTransferContext.EntryPoint $entryPoint;
    final /* synthetic */ String $entryPointString;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$onCreate$18$1(CreateTransferV2Duxo createTransferV2Duxo, String str, MAXTransferContext.EntryPoint entryPoint, CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2Duxo$onCreate$18$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2Duxo;
        this.$entryPointString = str;
        this.$entryPoint = entryPoint;
        this.$dataState = createTransferV2DataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2Duxo$onCreate$18$1(this.this$0, this.$entryPointString, this.$entryPoint, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$onCreate$18$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        CreateTransferV2Duxo$onCreate$18$1 createTransferV2Duxo$onCreate$18$1;
        String upsellDeeplink;
        Uri uri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            IacUpsellStore iacUpsellStore = this.this$0.iacUpsellStore;
            IacUpsellLocation iacUpsellLocation = IacUpsellLocation.UPSELL_MAX_TRANSFER;
            String str2 = this.$entryPointString;
            if (this.$entryPoint == MAXTransferContext.EntryPoint.TRANSFER_HUB) {
                str = "_" + this.$dataState.getDirection().getServerValue();
            } else {
                str = "";
            }
            this.label = 1;
            createTransferV2Duxo$onCreate$18$1 = this;
            obj = IacUpsellStore.getUpsellByLocation$default(iacUpsellStore, iacUpsellLocation, null, null, null, null, str2 + str, null, createTransferV2Duxo$onCreate$18$1, 94, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            createTransferV2Duxo$onCreate$18$1 = this;
        }
        IacUpsell iacUpsell = (IacUpsell) ((Optional) obj).getOrNull();
        if (iacUpsell != null && (upsellDeeplink = iacUpsell.getUpsellDeeplink()) != null && (uri = Uri.parse(upsellDeeplink)) != null) {
            createTransferV2Duxo$onCreate$18$1.this$0.submit(new CreateTransferV2Event.Deeplink(uri));
        }
        return Unit.INSTANCE;
    }
}
