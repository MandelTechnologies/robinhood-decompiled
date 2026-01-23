package com.robinhood.android.disclosures.lib.homescreen;

import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HomescreenDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/brokeragecontent/BrokerageDisclosure;", "account", "Lcom/robinhood/models/db/Account;", "curatedLists", "", "Lcom/robinhood/models/db/CuratedList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$standardDisclosureStream$1", m3645f = "HomescreenDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$standardDisclosureStream$1, reason: use source file name */
/* loaded from: classes27.dex */
final class HomescreenDisclosureDuxo3 extends ContinuationImpl7 implements Function3<Account, List<? extends CuratedList>, Continuation<? super BrokerageDisclosure>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* compiled from: HomescreenDisclosureDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureDuxo$onStart$standardDisclosureStream$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    HomescreenDisclosureDuxo3(Continuation<? super HomescreenDisclosureDuxo3> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Account account, List<CuratedList> list, Continuation<? super BrokerageDisclosure> continuation) {
        HomescreenDisclosureDuxo3 homescreenDisclosureDuxo3 = new HomescreenDisclosureDuxo3(continuation);
        homescreenDisclosureDuxo3.L$0 = account;
        homescreenDisclosureDuxo3.L$1 = list;
        return homescreenDisclosureDuxo3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Account account, List<? extends CuratedList> list, Continuation<? super BrokerageDisclosure> continuation) {
        return invoke2(account, (List<CuratedList>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BrokerageAccountType brokerageAccountType;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Account account = (Account) this.L$0;
        List list = (List) this.L$1;
        Object obj2 = null;
        ManagementType managementType = account != null ? account.getManagementType() : null;
        int i = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i != -1 && i != 1 && i != 2) {
            return null;
        }
        if (account != null && (brokerageAccountType = account.getBrokerageAccountType()) != null && brokerageAccountType.isRetirement()) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((CuratedList) next).isFuturesWatchlist()) {
                obj2 = next;
                break;
            }
        }
        if (((CuratedList) obj2) == null) {
            return BrokerageDisclosure.HOME_SCREEN;
        }
        return BrokerageDisclosure.HOME_SCREEN_WITH_FUTURES;
    }
}
