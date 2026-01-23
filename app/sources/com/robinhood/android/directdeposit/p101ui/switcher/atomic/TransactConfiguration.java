package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.http.ContentEncoding;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactConfiguration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003*+,BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JW\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration;", "", "publicToken", "", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicProduct;", "deeplink", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink;", "handoff", "", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicPage;", ResourceTypes.COLOR, "inSdk", "", "demoMode", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicProduct;Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink;Ljava/util/List;Ljava/lang/String;ZZ)V", "getPublicToken", "()Ljava/lang/String;", "getProduct", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicProduct;", "getDeeplink", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink;", "getHandoff", "()Ljava/util/List;", "getColor", "getInSdk", "()Z", "getDemoMode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "AtomicProduct", "AtomicPage", "TransactDeeplink", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class TransactConfiguration {
    public static final int $stable = 8;
    private final String color;
    private final TransactDeeplink deeplink;
    private final boolean demoMode;
    private final List<AtomicPage> handoff;
    private final boolean inSdk;
    private final AtomicProduct product;
    private final String publicToken;

    public static /* synthetic */ TransactConfiguration copy$default(TransactConfiguration transactConfiguration, String str, AtomicProduct atomicProduct, TransactDeeplink transactDeeplink, List list, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactConfiguration.publicToken;
        }
        if ((i & 2) != 0) {
            atomicProduct = transactConfiguration.product;
        }
        if ((i & 4) != 0) {
            transactDeeplink = transactConfiguration.deeplink;
        }
        if ((i & 8) != 0) {
            list = transactConfiguration.handoff;
        }
        if ((i & 16) != 0) {
            str2 = transactConfiguration.color;
        }
        if ((i & 32) != 0) {
            z = transactConfiguration.inSdk;
        }
        if ((i & 64) != 0) {
            z2 = transactConfiguration.demoMode;
        }
        boolean z3 = z;
        boolean z4 = z2;
        String str3 = str2;
        TransactDeeplink transactDeeplink2 = transactDeeplink;
        return transactConfiguration.copy(str, atomicProduct, transactDeeplink2, list, str3, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPublicToken() {
        return this.publicToken;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomicProduct getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final TransactDeeplink getDeeplink() {
        return this.deeplink;
    }

    public final List<AtomicPage> component4() {
        return this.handoff;
    }

    /* renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getInSdk() {
        return this.inSdk;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDemoMode() {
        return this.demoMode;
    }

    public final TransactConfiguration copy(String publicToken, AtomicProduct product, TransactDeeplink deeplink, List<? extends AtomicPage> handoff, String color, boolean inSdk, boolean demoMode) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(handoff, "handoff");
        Intrinsics.checkNotNullParameter(color, "color");
        return new TransactConfiguration(publicToken, product, deeplink, handoff, color, inSdk, demoMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactConfiguration)) {
            return false;
        }
        TransactConfiguration transactConfiguration = (TransactConfiguration) other;
        return Intrinsics.areEqual(this.publicToken, transactConfiguration.publicToken) && this.product == transactConfiguration.product && Intrinsics.areEqual(this.deeplink, transactConfiguration.deeplink) && Intrinsics.areEqual(this.handoff, transactConfiguration.handoff) && Intrinsics.areEqual(this.color, transactConfiguration.color) && this.inSdk == transactConfiguration.inSdk && this.demoMode == transactConfiguration.demoMode;
    }

    public int hashCode() {
        String str = this.publicToken;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.product.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.handoff.hashCode()) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.inSdk)) * 31) + Boolean.hashCode(this.demoMode);
    }

    public String toString() {
        return "TransactConfiguration(publicToken=" + this.publicToken + ", product=" + this.product + ", deeplink=" + this.deeplink + ", handoff=" + this.handoff + ", color=" + this.color + ", inSdk=" + this.inSdk + ", demoMode=" + this.demoMode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactConfiguration(String str, AtomicProduct product, TransactDeeplink deeplink, List<? extends AtomicPage> handoff, String color, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(handoff, "handoff");
        Intrinsics.checkNotNullParameter(color, "color");
        this.publicToken = str;
        this.product = product;
        this.deeplink = deeplink;
        this.handoff = handoff;
        this.color = color;
        this.inSdk = z;
        this.demoMode = z2;
    }

    public /* synthetic */ TransactConfiguration(String str, AtomicProduct atomicProduct, TransactDeeplink transactDeeplink, List list, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, atomicProduct, transactDeeplink, list, str2, z, z2);
    }

    public final String getPublicToken() {
        return this.publicToken;
    }

    public final AtomicProduct getProduct() {
        return this.product;
    }

    public final TransactDeeplink getDeeplink() {
        return this.deeplink;
    }

    public final List<AtomicPage> getHandoff() {
        return this.handoff;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getInSdk() {
        return this.inSdk;
    }

    public final boolean getDemoMode() {
        return this.demoMode;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicProduct;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEPOSIT", "VERIFY", "IDENTITY", "UNKNOWN", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AtomicProduct implements RhEnum<AtomicProduct> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AtomicProduct[] $VALUES;
        private final String serverValue;
        public static final AtomicProduct DEPOSIT = new AtomicProduct("DEPOSIT", 0, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE);
        public static final AtomicProduct VERIFY = new AtomicProduct("VERIFY", 1, Card.Icon.VERIFY);
        public static final AtomicProduct IDENTITY = new AtomicProduct("IDENTITY", 2, ContentEncoding.IDENTITY);
        public static final AtomicProduct UNKNOWN = new AtomicProduct("UNKNOWN", 3, "unknown");

        private static final /* synthetic */ AtomicProduct[] $values() {
            return new AtomicProduct[]{DEPOSIT, VERIFY, IDENTITY, UNKNOWN};
        }

        public static EnumEntries<AtomicProduct> getEntries() {
            return $ENTRIES;
        }

        private AtomicProduct(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            AtomicProduct[] atomicProductArr$values = $values();
            $VALUES = atomicProductArr$values;
            $ENTRIES = EnumEntries2.enumEntries(atomicProductArr$values);
            INSTANCE = new Companion(null);
        }

        public static AtomicProduct valueOf(String str) {
            return (AtomicProduct) Enum.valueOf(AtomicProduct.class, str);
        }

        public static AtomicProduct[] values() {
            return (AtomicProduct[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TransactConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$AtomicPage;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "EXIT_PROMPT", "AUTHENTICATION_SUCCESS", "UNKNOWN", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AtomicPage implements RhEnum<AtomicPage> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AtomicPage[] $VALUES;
        private final String serverValue;
        public static final AtomicPage EXIT_PROMPT = new AtomicPage("EXIT_PROMPT", 0, "exit-prompt");
        public static final AtomicPage AUTHENTICATION_SUCCESS = new AtomicPage("AUTHENTICATION_SUCCESS", 1, "authentication-success");
        public static final AtomicPage UNKNOWN = new AtomicPage("UNKNOWN", 2, "unknown");

        private static final /* synthetic */ AtomicPage[] $values() {
            return new AtomicPage[]{EXIT_PROMPT, AUTHENTICATION_SUCCESS, UNKNOWN};
        }

        public static EnumEntries<AtomicPage> getEntries() {
            return $ENTRIES;
        }

        private AtomicPage(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            AtomicPage[] atomicPageArr$values = $values();
            $VALUES = atomicPageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(atomicPageArr$values);
            INSTANCE = new Companion(null);
        }

        public static AtomicPage valueOf(String str) {
            return (AtomicPage) Enum.valueOf(AtomicPage.class, str);
        }

        public static AtomicPage[] values() {
            return (AtomicPage[]) $VALUES.clone();
        }
    }

    /* compiled from: TransactConfiguration.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink;", "", "step", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink$Step;", "companyId", "", "connectorId", "companyName", "<init>", "(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink$Step;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStep", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink$Step;", "getCompanyId", "()Ljava/lang/String;", "getConnectorId", "getCompanyName", "Step", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransactDeeplink {
        public static final int $stable = 0;
        private final String companyId;
        private final String companyName;
        private final String connectorId;
        private final Step step;

        public TransactDeeplink(Step step, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
            this.companyId = str;
            this.connectorId = str2;
            this.companyName = str3;
        }

        public /* synthetic */ TransactDeeplink(Step step, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(step, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final Step getStep() {
            return this.step;
        }

        public final String getCompanyId() {
            return this.companyId;
        }

        public final String getConnectorId() {
            return this.connectorId;
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TransactConfiguration.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactConfiguration$TransactDeeplink$Step;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "SEARCH_COMPANY", "LOGIN_COMPANY", "LOGIN_CONNECTOR", "UNKNOWN", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Step implements RhEnum<Step> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Step[] $VALUES;
            private final String serverValue;
            public static final Step SEARCH_COMPANY = new Step("SEARCH_COMPANY", 0, "search-company");
            public static final Step LOGIN_COMPANY = new Step("LOGIN_COMPANY", 1, "login-company");
            public static final Step LOGIN_CONNECTOR = new Step("LOGIN_CONNECTOR", 2, "login-connector");
            public static final Step UNKNOWN = new Step("UNKNOWN", 3, "unknown");

            private static final /* synthetic */ Step[] $values() {
                return new Step[]{SEARCH_COMPANY, LOGIN_COMPANY, LOGIN_CONNECTOR, UNKNOWN};
            }

            public static EnumEntries<Step> getEntries() {
                return $ENTRIES;
            }

            private Step(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Step[] stepArr$values = $values();
                $VALUES = stepArr$values;
                $ENTRIES = EnumEntries2.enumEntries(stepArr$values);
                INSTANCE = new Companion(null);
            }

            public static Step valueOf(String str) {
                return (Step) Enum.valueOf(Step.class, str);
            }

            public static Step[] values() {
                return (Step[]) $VALUES.clone();
            }
        }
    }
}
