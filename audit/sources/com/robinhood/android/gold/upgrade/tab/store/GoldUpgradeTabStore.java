package com.robinhood.android.gold.upgrade.tab.store;

import com.robinhood.android.gold.upgrade.tab.api.GoldUpgradeTabApi;
import com.robinhood.android.gold.upgrade.tab.model.ApiGoldUpgradeTab;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldUpgradeTabStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/store/GoldUpgradeTabStore;", "Lcom/robinhood/store/Store;", "goldUpgradeTabApi", "Lcom/robinhood/android/gold/upgrade/tab/api/GoldUpgradeTabApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/gold/upgrade/tab/api/GoldUpgradeTabApi;Lcom/robinhood/store/StoreBundle;)V", "getGoldUpgradeTab", "Lcom/robinhood/android/gold/upgrade/tab/model/ApiGoldUpgradeTab;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldUpgradeTabStore extends Store {
    public static final int $stable = 8;
    private final GoldUpgradeTabApi goldUpgradeTabApi;

    /* compiled from: GoldUpgradeTabStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.store.GoldUpgradeTabStore", m3645f = "GoldUpgradeTabStore.kt", m3646l = {18}, m3647m = "getGoldUpgradeTab")
    /* renamed from: com.robinhood.android.gold.upgrade.tab.store.GoldUpgradeTabStore$getGoldUpgradeTab$1 */
    static final class C181571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C181571(Continuation<? super C181571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldUpgradeTabStore.this.getGoldUpgradeTab(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUpgradeTabStore(GoldUpgradeTabApi goldUpgradeTabApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeTabApi, "goldUpgradeTabApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.goldUpgradeTabApi = goldUpgradeTabApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGoldUpgradeTab(Continuation<? super ApiGoldUpgradeTab> continuation) {
        C181571 c181571;
        Object objM28550constructorimpl;
        if (continuation instanceof C181571) {
            c181571 = (C181571) continuation;
            int i = c181571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c181571.label = i - Integer.MIN_VALUE;
            } else {
                c181571 = new C181571(continuation);
            }
        }
        Object goldUpgradeTab = c181571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c181571.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(goldUpgradeTab);
                Result.Companion companion = Result.INSTANCE;
                GoldUpgradeTabApi goldUpgradeTabApi = this.goldUpgradeTabApi;
                c181571.label = 1;
                goldUpgradeTab = goldUpgradeTabApi.getGoldUpgradeTab(c181571);
                if (goldUpgradeTab == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(goldUpgradeTab);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiGoldUpgradeTab) goldUpgradeTab);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, thM28553exceptionOrNullimpl, false, null, 4, null);
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }
}
