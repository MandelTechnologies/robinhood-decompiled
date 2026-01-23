package com.robinhood.android.crypto.p094ui.detail.banner;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBannerDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState;", "", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/serverdriven/db/BannerComponent;", "iacBannerState", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "<init>", "(Lcom/robinhood/models/serverdriven/db/BannerComponent;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;)V", "getIacBannerState", "()Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "bannerState", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "getBannerState", "()Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IacBannerState", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoBannerDataState {
    public static final int $stable = 8;
    private final BannerComponent banner;
    private final IacBannerState iacBannerState;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoBannerDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final BannerComponent getBanner() {
        return this.banner;
    }

    public static /* synthetic */ CryptoBannerDataState copy$default(CryptoBannerDataState cryptoBannerDataState, BannerComponent bannerComponent, IacBannerState iacBannerState, int i, Object obj) {
        if ((i & 1) != 0) {
            bannerComponent = cryptoBannerDataState.banner;
        }
        if ((i & 2) != 0) {
            iacBannerState = cryptoBannerDataState.iacBannerState;
        }
        return cryptoBannerDataState.copy(bannerComponent, iacBannerState);
    }

    /* renamed from: component2, reason: from getter */
    public final IacBannerState getIacBannerState() {
        return this.iacBannerState;
    }

    public final CryptoBannerDataState copy(BannerComponent banner, IacBannerState iacBannerState) {
        return new CryptoBannerDataState(banner, iacBannerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoBannerDataState)) {
            return false;
        }
        CryptoBannerDataState cryptoBannerDataState = (CryptoBannerDataState) other;
        return Intrinsics.areEqual(this.banner, cryptoBannerDataState.banner) && Intrinsics.areEqual(this.iacBannerState, cryptoBannerDataState.iacBannerState);
    }

    public int hashCode() {
        BannerComponent bannerComponent = this.banner;
        int iHashCode = (bannerComponent == null ? 0 : bannerComponent.hashCode()) * 31;
        IacBannerState iacBannerState = this.iacBannerState;
        return iHashCode + (iacBannerState != null ? iacBannerState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoBannerDataState(banner=" + this.banner + ", iacBannerState=" + this.iacBannerState + ")";
    }

    public CryptoBannerDataState(BannerComponent bannerComponent, IacBannerState iacBannerState) {
        this.banner = bannerComponent;
        this.iacBannerState = iacBannerState;
    }

    public /* synthetic */ CryptoBannerDataState(BannerComponent bannerComponent, IacBannerState iacBannerState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bannerComponent, (i & 2) != 0 ? null : iacBannerState);
    }

    public final IacBannerState getIacBannerState() {
        return this.iacBannerState;
    }

    public final CryptoBannerState getBannerState() {
        BannerComponent bannerComponent = this.banner;
        if (bannerComponent == null) {
            return null;
        }
        GenericAction action = bannerComponent.getAction();
        RichText title = bannerComponent.getTitle();
        ServerToBentoAssetMapper2 icon = bannerComponent.getIcon();
        return new CryptoBannerState(action, icon != null ? BentoIcon4.INSTANCE.toBentoIcon(icon) : null, title);
    }

    /* compiled from: CryptoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "DefaultAccount", "SelectedAccount", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState$DefaultAccount;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState$SelectedAccount;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface IacBannerState {
        String getAccountNumber();

        /* compiled from: CryptoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState$DefaultAccount;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "<init>", "()V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DefaultAccount implements IacBannerState {
            public static final int $stable = 0;
            public static final DefaultAccount INSTANCE = new DefaultAccount();
            private static final String accountNumber = null;

            public boolean equals(Object other) {
                return this == other || (other instanceof DefaultAccount);
            }

            public int hashCode() {
                return -2131914714;
            }

            public String toString() {
                return "DefaultAccount";
            }

            private DefaultAccount() {
            }

            @Override // com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDataState.IacBannerState
            public String getAccountNumber() {
                return accountNumber;
            }
        }

        /* compiled from: CryptoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState$SelectedAccount;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelectedAccount implements IacBannerState {
            public static final int $stable = 0;
            private final String accountNumber;

            public static /* synthetic */ SelectedAccount copy$default(SelectedAccount selectedAccount, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selectedAccount.accountNumber;
                }
                return selectedAccount.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SelectedAccount copy(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return new SelectedAccount(accountNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectedAccount) && Intrinsics.areEqual(this.accountNumber, ((SelectedAccount) other).accountNumber);
            }

            public int hashCode() {
                return this.accountNumber.hashCode();
            }

            public String toString() {
                return "SelectedAccount(accountNumber=" + this.accountNumber + ")";
            }

            public SelectedAccount(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                this.accountNumber = accountNumber;
            }

            @Override // com.robinhood.android.crypto.ui.detail.banner.CryptoBannerDataState.IacBannerState
            public String getAccountNumber() {
                return this.accountNumber;
            }
        }
    }
}
