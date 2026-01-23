package com.robinhood.android.doc.serverdriven.country;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: SddrCountryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$userLocality$1", m3645f = "SddrCountryDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$userLocality$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SddrCountryDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CountryCode.Supported>, Object> {
    int label;
    final /* synthetic */ SddrCountryDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SddrCountryDuxo3(SddrCountryDuxo sddrCountryDuxo, Continuation<? super SddrCountryDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = sddrCountryDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SddrCountryDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CountryCode.Supported> continuation) {
        return ((SddrCountryDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ObservableSource map = this.this$0.userStore.getUser().map(new Function() { // from class: com.robinhood.android.doc.serverdriven.country.SddrCountryDuxo$onCreate$1$userLocality$1.1
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrigin().getLocality();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.label = 1;
        Object objAwaitFirst = RxAwait3.awaitFirst(map, this);
        return objAwaitFirst == coroutine_suspended ? coroutine_suspended : objAwaitFirst;
    }
}
