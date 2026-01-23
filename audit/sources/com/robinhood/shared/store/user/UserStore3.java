package com.robinhood.shared.store.user;

import com.robinhood.models.dao.UserDao;
import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: UserStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.store.user.UserStore$getUserEndpoint$2, reason: use source file name */
/* loaded from: classes21.dex */
/* synthetic */ class UserStore3 extends AdaptedFunctionReference implements Function2<User, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    UserStore3(Object obj) {
        super(2, obj, UserDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(User user, Continuation<? super Unit> continuation) {
        return UserStore.getUserEndpoint$insert((UserDao) this.receiver, user, continuation);
    }
}
