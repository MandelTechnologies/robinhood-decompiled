package microgram.datasource.brokeback;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import microgram.datasource.PaginatedList;
import microgram.datasource.brokeback.models.Account;

/* compiled from: Brokeback.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m3636d2 = {"Lmicrogram/datasource/brokeback/Brokeback;", "", "getAccounts", "Lkotlin/Result;", "Lmicrogram/datasource/PaginatedList;", "Lmicrogram/datasource/brokeback/models/Account;", "defaultToAllAccounts", "", "getAccounts-gIAlu-s", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram-datasource"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface Brokeback {
    /* renamed from: getAccounts-gIAlu-s, reason: not valid java name */
    Object m29224getAccountsgIAlus(boolean z, Continuation<? super Result<PaginatedList<Account>>> continuation);

    /* compiled from: Brokeback.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* renamed from: getAccounts-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m29225getAccountsgIAlus$default(Brokeback brokeback, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccounts-gIAlu-s");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return brokeback.m29224getAccountsgIAlus(z, continuation);
        }
    }
}
