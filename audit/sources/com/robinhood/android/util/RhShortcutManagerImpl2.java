package com.robinhood.android.util;

import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.app.provisions.C9563R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.deeplink.DeepLinkPath;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RhShortcutManagerImpl.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"iconResId", "", "Lcom/robinhood/android/common/util/RhShortcut;", "getIconResId", "(Lcom/robinhood/android/common/util/RhShortcut;)I", "labelResIdShort", "getLabelResIdShort", "labelResIdLong", "getLabelResIdLong", "deepLinkPath", "", "getDeepLinkPath", "(Lcom/robinhood/android/common/util/RhShortcut;)Ljava/lang/String;", "createIntent", "Landroid/content/Intent;", "app-provisions_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.util.RhShortcutManagerImplKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RhShortcutManagerImpl2 {

    /* compiled from: RhShortcutManagerImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.util.RhShortcutManagerImplKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhShortcut.values().length];
            try {
                iArr[RhShortcut.SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhShortcut.SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RhShortcut.ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RhShortcut.HISTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RhShortcut.DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RhShortcut.DEPOSIT_QUEUED_DEPOSIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RhShortcut.LINK_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIconResId(RhShortcut rhShortcut) {
        switch (WhenMappings.$EnumSwitchMapping$0[rhShortcut.ordinal()]) {
            case 1:
                return C9563R.drawable.svg_ic_shortcut_search;
            case 2:
                return C9563R.drawable.svg_ic_shortcut_settings;
            case 3:
                return C9563R.drawable.svg_ic_shortcut_account;
            case 4:
                return C9563R.drawable.svg_ic_shortcut_history;
            case 5:
            case 6:
            case 7:
                return C9563R.drawable.svg_ic_shortcut_banking;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResIdShort(RhShortcut rhShortcut) {
        switch (WhenMappings.$EnumSwitchMapping$0[rhShortcut.ordinal()]) {
            case 1:
                return C9563R.string.shortcut_search_short;
            case 2:
                return C9563R.string.shortcut_settings_short;
            case 3:
                return C9563R.string.shortcut_account_short;
            case 4:
                return C9563R.string.shortcut_history_short;
            case 5:
            case 6:
                return C11048R.string.general_action_deposit_funds;
            case 7:
                return C9563R.string.shortcut_link_account_short;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResIdLong(RhShortcut rhShortcut) {
        switch (WhenMappings.$EnumSwitchMapping$0[rhShortcut.ordinal()]) {
            case 1:
                return C9563R.string.shortcut_search_long;
            case 2:
                return C9563R.string.shortcut_settings_long;
            case 3:
                return C9563R.string.shortcut_account_long;
            case 4:
                return C9563R.string.shortcut_history_long;
            case 5:
            case 6:
                return C9563R.string.shortcut_deposit_long;
            case 7:
                return C9563R.string.shortcut_link_account_long;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeepLinkPath(RhShortcut rhShortcut) {
        switch (WhenMappings.$EnumSwitchMapping$0[rhShortcut.ordinal()]) {
            case 1:
                return DeepLinkPath.SHORTCUT_SEARCH.getUri();
            case 2:
                return DeepLinkPath.SHORTCUT_SETTINGS.getUri();
            case 3:
                return DeepLinkPath.SHORTCUT_ACCOUNT.getUri();
            case 4:
                return DeepLinkPath.SHORTCUT_HISTORY.getUri();
            case 5:
                return DeepLinkPath.SHORTCUT_DEPOSIT.getUri();
            case 6:
                return DeepLinkPath.SHORTCUT_DEPOSIT_QUEUED.getUri();
            case 7:
                return DeepLinkPath.SHORTCUT_LINK_ACCOUNT.getUri();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent createIntent(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }
}
