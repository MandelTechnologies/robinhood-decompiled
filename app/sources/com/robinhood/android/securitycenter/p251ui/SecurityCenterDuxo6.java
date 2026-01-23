package com.robinhood.android.securitycenter.p251ui;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.staticcontent.util.Markwons;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$7$1", m3645f = "SecurityCenterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterDuxo$onResume$7$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SecurityCenterDuxo6 extends ContinuationImpl7 implements Function2<SecurityCenterDataState, Continuation<? super SecurityCenterDataState>, Object> {
    final /* synthetic */ String $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecurityCenterDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecurityCenterDuxo6(SecurityCenterDuxo securityCenterDuxo, String str, Continuation<? super SecurityCenterDuxo6> continuation) {
        super(2, continuation);
        this.this$0 = securityCenterDuxo;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityCenterDuxo6 securityCenterDuxo6 = new SecurityCenterDuxo6(this.this$0, this.$it, continuation);
        securityCenterDuxo6.L$0 = obj;
        return securityCenterDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SecurityCenterDataState securityCenterDataState, Continuation<? super SecurityCenterDataState> continuation) {
        return ((SecurityCenterDuxo6) create(securityCenterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SecurityCenterDataState securityCenterDataState = (SecurityCenterDataState) this.L$0;
            Markwon markwon = this.this$0.markwon;
            String str = this.$it;
            Intrinsics.checkNotNull(str);
            return SecurityCenterDataState.copy$default(securityCenterDataState, false, false, false, null, false, false, false, Markwons.toSpanned$default(markwon, new MarkdownContent(str), null, 2, null).toString(), false, false, false, 1918, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
