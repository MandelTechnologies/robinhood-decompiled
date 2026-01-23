package com.robinhood.android.acatsin.intro;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acatsin.intro.AcatsInIntroContract;
import com.robinhood.android.acatsin.intro.AcatsInIntroDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onResume$2$1", m3645f = "AcatsInIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInIntroDuxo2 extends ContinuationImpl7 implements Function2<AcatsInIntroDataState, Continuation<? super AcatsInIntroDataState>, Object> {
    final /* synthetic */ ApiAcatsWelcomeContents $response;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsInIntroDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInIntroDuxo2(AcatsInIntroDuxo acatsInIntroDuxo, ApiAcatsWelcomeContents apiAcatsWelcomeContents, Continuation<? super AcatsInIntroDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = acatsInIntroDuxo;
        this.$response = apiAcatsWelcomeContents;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsInIntroDuxo2 acatsInIntroDuxo2 = new AcatsInIntroDuxo2(this.this$0, this.$response, continuation);
        acatsInIntroDuxo2.L$0 = obj;
        return acatsInIntroDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AcatsInIntroDataState acatsInIntroDataState, Continuation<? super AcatsInIntroDataState> continuation) {
        return ((AcatsInIntroDuxo2) create(acatsInIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) this.L$0;
        if (acatsInIntroDataState.getPages() == null) {
            EventLogger.DefaultImpls.logScreenAppear$default(this.this$0.eventLogger, null, this.this$0.getScreen(acatsInIntroDataState.getPageIndex()), null, null, ((AcatsInIntroContract.Key) AcatsInIntroDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getScreenContext().toEventContext(), 13, null);
        }
        AcatsInIntroDuxo.Companion companion = AcatsInIntroDuxo.INSTANCE;
        if (!((AcatsInIntroContract.Key) companion.getArgs((HasSavedState) this.this$0)).getBonusOnly()) {
            List<List<UIComponent<GenericAction>>> pages = this.$response.getPages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(extensions2.toPersistentList((List) it.next()));
            }
            return AcatsInIntroDataState.copy$default(acatsInIntroDataState, extensions2.toPersistentList(arrayList), 0, null, null, false, this.$response.getLottieSpecs(), this.$response.getLottieUrl(), 30, null);
        }
        ApiAcatsBonusPromoInfo promoInfo = ((AcatsInIntroContract.Key) companion.getArgs((HasSavedState) this.this$0)).getPromoInfo();
        int promo_intro_length = promoInfo != null ? promoInfo.getPromo_intro_length() : 1;
        List listTake = CollectionsKt.take(this.$response.getPages(), promo_intro_length);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it2 = listTake.iterator();
        while (it2.hasNext()) {
            arrayList2.add(extensions2.toPersistentList((List) it2.next()));
        }
        return AcatsInIntroDataState.copy$default(acatsInIntroDataState, extensions2.toPersistentList(arrayList2), 0, null, null, false, CollectionsKt.take(this.$response.getLottieSpecs(), promo_intro_length), this.$response.getLottieUrl(), 30, null);
    }
}
