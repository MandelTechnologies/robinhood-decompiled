package com.robinhood.android.account.accountfunding;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.enums.RhEnum;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountFundingOptionsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "ACCOUNT_NUMBER_QUERY_PARAM", "", "TRANSFER_FUNDS_ENTRY_POINT_QUERY_PARAM", "SOURCE_QUERY_PARAM", "PRESENTATION_STYLE_QUERY_PARAM", "LOCATION_QUERY_PARAM", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "PresentationStyle", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountFundingOptionsDeeplinkTarget extends DeeplinkTarget4 {
    private static final String ACCOUNT_NUMBER_QUERY_PARAM = "account_number";
    private static final String LOCATION_QUERY_PARAM = "location";
    private static final String PRESENTATION_STYLE_QUERY_PARAM = "presentation_style";
    private static final String SOURCE_QUERY_PARAM = "source";
    private static final String TRANSFER_FUNDS_ENTRY_POINT_QUERY_PARAM = "transfer_funds_entry_point";
    public static final AccountFundingOptionsDeeplinkTarget INSTANCE = new AccountFundingOptionsDeeplinkTarget();
    public static final int $stable = 8;

    /* compiled from: AccountFundingOptionsDeeplinkTarget.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PresentationStyle.values().length];
            try {
                iArr[PresentationStyle.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationStyle.SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AccountFundingOptionsDeeplinkTarget() {
        super("account_funding_options", false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountFundingOptionsDeeplinkTarget.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDeeplinkTarget$PresentationStyle;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "FULL_SCREEN", "SHEET", "Companion", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PresentationStyle implements RhEnum<PresentationStyle> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PresentationStyle[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PresentationStyle FULL_SCREEN = new PresentationStyle("FULL_SCREEN", 0, "full_screen");
        public static final PresentationStyle SHEET = new PresentationStyle("SHEET", 1, "sheet");
        private final String serverValue;

        private static final /* synthetic */ PresentationStyle[] $values() {
            return new PresentationStyle[]{FULL_SCREEN, SHEET};
        }

        public static EnumEntries<PresentationStyle> getEntries() {
            return $ENTRIES;
        }

        private PresentationStyle(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            PresentationStyle[] presentationStyleArr$values = $values();
            $VALUES = presentationStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(presentationStyleArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: AccountFundingOptionsDeeplinkTarget.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDeeplinkTarget$PresentationStyle$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDeeplinkTarget$PresentationStyle;", "<init>", "()V", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Defaulted<PresentationStyle> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) PresentationStyle.getEntries().toArray(new PresentationStyle[0]), PresentationStyle.FULL_SCREEN, false, 4, null);
            }
        }

        public static PresentationStyle valueOf(String str) {
            return (PresentationStyle) Enum.valueOf(PresentationStyle.class, str);
        }

        public static PresentationStyle[] values() {
            return (PresentationStyle[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent intentCreateIntent$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(TRANSFER_FUNDS_ENTRY_POINT_QUERY_PARAM);
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("source");
        PresentationStyle presentationStyle = (PresentationStyle) PresentationStyle.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter(PRESENTATION_STYLE_QUERY_PARAM));
        if (presentationStyle == null) {
            presentationStyle = PresentationStyle.FULL_SCREEN;
        }
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter(LOCATION_QUERY_PARAM);
        if (queryParameter == null) {
            CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Launched account funding options without an account number"), true, new EventMetadata(SentryTeam.RAD, null, null, 6, null));
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        int i = WhenMappings.$EnumSwitchMapping$0[presentationStyle.ordinal()];
        if (i == 1) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AccountFundingOptionsFragmentKeys.FullScreen(queryParameter, queryParameter2, queryParameter4, queryParameter3), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intentCreateIntent$default = Navigator.DefaultImpls.createIntentForDialogFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AccountFundingOptionsFragmentKeys.BottomSheet(queryParameter, queryParameter2, queryParameter4, queryParameter3), null, 4, null);
        }
        return new Intent[]{intentCreateIntent$default};
    }
}
