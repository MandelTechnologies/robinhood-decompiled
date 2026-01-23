package com.robinhood.android.cortex.store.portfolio;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.GetPortfolioDigestRequestDto;
import bonfire.proto.idl.copilot.p032v1.GetPortfolioDigestResponseDto;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest5;
import com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore2;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PortfolioDigestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestEndpoint$1", m3645f = "PortfolioDigestStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PortfolioDigestStore3 extends ContinuationImpl7 implements Function2<String, Continuation<? super PortfolioDigestStore2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PortfolioDigestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioDigestStore3(PortfolioDigestStore portfolioDigestStore, Continuation<? super PortfolioDigestStore3> continuation) {
        super(2, continuation);
        this.this$0 = portfolioDigestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PortfolioDigestStore3 portfolioDigestStore3 = new PortfolioDigestStore3(this.this$0, continuation);
        portfolioDigestStore3.L$0 = obj;
        return portfolioDigestStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super PortfolioDigestStore2> continuation) {
        return ((PortfolioDigestStore3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        Exception e;
        Integer httpStatusCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.L$0;
            try {
                CopilotService copilotService = this.this$0.copilotService;
                GetPortfolioDigestRequestDto getPortfolioDigestRequestDto = new GetPortfolioDigestRequestDto(str2);
                this.L$0 = str2;
                this.label = 1;
                Object objGetPortfolioDigest = copilotService.GetPortfolioDigest(getPortfolioDigestRequestDto, this);
                if (objGetPortfolioDigest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                obj = objGetPortfolioDigest;
            } catch (Exception e2) {
                str = str2;
                e = e2;
                httpStatusCode = Throwables.getHttpStatusCode(e);
                if (httpStatusCode == null && httpStatusCode.intValue() == 404) {
                    return new PortfolioDigestStore2.NotFound(str, e);
                }
                throw e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                httpStatusCode = Throwables.getHttpStatusCode(e);
                if (httpStatusCode == null) {
                }
                throw e;
            }
        }
        Tuples2<PortfolioDigest, ImmutableList<ArticleSource>> uiModel = PortfolioDigest5.toUiModel((GetPortfolioDigestResponseDto) obj);
        return new PortfolioDigestStore2.Success(str, uiModel.component1(), uiModel.component2());
    }
}
