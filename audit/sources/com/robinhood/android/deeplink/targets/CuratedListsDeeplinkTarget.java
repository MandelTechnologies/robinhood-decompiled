package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.utils.extensions.StringsKt;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/CuratedListsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CuratedListsDeeplinkTarget extends DeeplinkTarget4 {
    public static final CuratedListsDeeplinkTarget INSTANCE = new CuratedListsDeeplinkTarget();
    public static final int $stable = 8;

    private CuratedListsDeeplinkTarget() {
        super(DeepLinkPath.CURATED_LISTS.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        UUID uuid3;
        UUID uuid4;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        FragmentTab fragmentTab = null;
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("filter_id");
        ApiCuratedList.OwnerType ownerTypeFromServerValue = ApiCuratedList.OwnerType.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("owner_type"));
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("popover_ipo_announcement_id");
        if (queryParameter3 != null) {
            try {
                uuid3 = StringsKt.toUuid(queryParameter3);
            } catch (IllegalArgumentException unused2) {
                uuid3 = null;
            }
            uuid4 = uuid3;
        } else {
            uuid4 = null;
        }
        Iterator<FragmentTab> it = FragmentTab.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FragmentTab next = it.next();
            if (Intrinsics.areEqual(next.name(), deeplinkContext.getUri().getQueryParameter("tab"))) {
                fragmentTab = next;
                break;
            }
        }
        FragmentTab fragmentTab2 = fragmentTab;
        if (uuid2 == null || ownerTypeFromServerValue != ApiCuratedList.OwnerType.ROBINHOOD) {
            return new Intent[]{deeplinkContext.getMainIntent()};
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CuratedListKey.RhList(uuid2, uuid4, null, queryParameter2, 4, null), false, false, false, fragmentTab2, false, false, false, false, false, null, false, 8156, null)};
    }
}
