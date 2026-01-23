package com.robinhood.android.acatsin.util.names;

import com.robinhood.android.jointaccounts.api.JointAccountsApi;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.jointaccounts.api.users.ApiJointUserInfo;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: FetchAccountNamesUseCase.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "jointAccountsApi", "Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/jointaccounts/api/JointAccountsApi;)V", "invoke", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "rhsAccountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class FetchAccountNamesUseCase {
    public static final int $stable = 8;
    private final JointAccountsApi jointAccountsApi;
    private final UserStore userStore;

    /* compiled from: FetchAccountNamesUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase", m3645f = "FetchAccountNamesUseCase.kt", m3646l = {19, 22, 35}, m3647m = "invoke")
    /* renamed from: com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase$invoke$1 */
    static final class C80631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C80631(Continuation<? super C80631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchAccountNamesUseCase.this.invoke(null, null, this);
        }
    }

    public FetchAccountNamesUseCase(UserStore userStore, JointAccountsApi jointAccountsApi) {
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(jointAccountsApi, "jointAccountsApi");
        this.userStore = userStore;
        this.jointAccountsApi = jointAccountsApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[LOOP:1: B:24:0x0077->B:26:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da A[EDGE_INSN: B:48:0x00da->B:37:0x00da BREAK  A[LOOP:0: B:32:0x00be->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, BrokerageAccountType brokerageAccountType, Continuation<? super NamesOnAccount> continuation) {
        C80631 c80631;
        ApiJointUsers apiJointUsers;
        Object objFirst;
        List list;
        Iterator<T> it;
        if (continuation instanceof C80631) {
            c80631 = (C80631) continuation;
            int i = c80631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c80631.label = i - Integer.MIN_VALUE;
            } else {
                c80631 = new C80631(continuation);
            }
        }
        Object objFirst2 = c80631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c80631.label;
        Object obj = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst2);
            if (brokerageAccountType == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                JointAccountsApi jointAccountsApi = this.jointAccountsApi;
                c80631.label = 1;
                objFirst2 = jointAccountsApi.getJointUsers(str, c80631);
                if (objFirst2 != coroutine_suspended) {
                    apiJointUsers = (ApiJointUsers) objFirst2;
                    List<ApiJointUserInfo> joint_users = apiJointUsers.getJoint_users();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(joint_users, 10));
                    while (r10.hasNext()) {
                    }
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                    c80631.L$0 = apiJointUsers;
                    c80631.L$1 = arrayList;
                    c80631.label = 2;
                    objFirst = FlowKt.first(flowBuffer$default, c80631);
                    if (objFirst != coroutine_suspended) {
                    }
                }
            } else {
                Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                c80631.label = 3;
                objFirst2 = FlowKt.first(flowBuffer$default2, c80631);
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst2);
                User user = (User) objFirst2;
                NamesOnAccount2 namesOnAccount2 = new NamesOnAccount2(user.getFirstName(), user.getLastName());
                return new NamesOnAccount(namesOnAccount2, CollectionsKt.listOf(namesOnAccount2));
            }
            list = (List) c80631.L$1;
            apiJointUsers = (ApiJointUsers) c80631.L$0;
            ResultKt.throwOnFailure(objFirst2);
            User user2 = (User) objFirst2;
            it = apiJointUsers.getJoint_users().iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((ApiJointUserInfo) next).getUser_id(), user2.getId())) {
                    obj = next;
                    break;
                }
            }
            ApiJointUserInfo apiJointUserInfo = (ApiJointUserInfo) obj;
            return new NamesOnAccount(apiJointUserInfo == null ? new NamesOnAccount2(apiJointUserInfo.getFirst_name(), apiJointUserInfo.getLast_name()) : new NamesOnAccount2(user2.getFirstName(), user2.getLastName()), list);
        }
        ResultKt.throwOnFailure(objFirst2);
        apiJointUsers = (ApiJointUsers) objFirst2;
        List<ApiJointUserInfo> joint_users2 = apiJointUsers.getJoint_users();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(joint_users2, 10));
        for (ApiJointUserInfo apiJointUserInfo2 : joint_users2) {
            arrayList2.add(new NamesOnAccount2(apiJointUserInfo2.getFirst_name(), apiJointUserInfo2.getLast_name()));
        }
        Flow flowBuffer$default3 = Context7.buffer$default(RxConvert.asFlow(this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
        c80631.L$0 = apiJointUsers;
        c80631.L$1 = arrayList2;
        c80631.label = 2;
        objFirst = FlowKt.first(flowBuffer$default3, c80631);
        if (objFirst != coroutine_suspended) {
            objFirst2 = objFirst;
            list = arrayList2;
            User user22 = (User) objFirst2;
            it = apiJointUsers.getJoint_users().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            ApiJointUserInfo apiJointUserInfo3 = (ApiJointUserInfo) obj;
            return new NamesOnAccount(apiJointUserInfo3 == null ? new NamesOnAccount2(apiJointUserInfo3.getFirst_name(), apiJointUserInfo3.getLast_name()) : new NamesOnAccount2(user22.getFirstName(), user22.getLastName()), list);
        }
        return coroutine_suspended;
    }
}
