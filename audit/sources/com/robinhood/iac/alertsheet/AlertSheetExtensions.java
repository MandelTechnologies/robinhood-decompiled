package com.robinhood.iac.alertsheet;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InAppComm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertSheetExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "Lcom/robinhood/models/ui/IacAlertSheet;", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "lib-iac-alert-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.alertsheet.AlertSheetExtensionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class AlertSheetExtensions {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Context eventContext(IacAlertSheet iacAlertSheet, Context.ProductTag productTag) {
        String text;
        String text2;
        Intrinsics.checkNotNullParameter(iacAlertSheet, "<this>");
        Intrinsics.checkNotNullParameter(productTag, "productTag");
        String string2 = iacAlertSheet.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        RichText title = iacAlertSheet.getTitle();
        String str = (title == null || (text2 = title.getText()) == null) ? "" : text2;
        RichText description = iacAlertSheet.getDescription();
        String str2 = null;
        return new Context(0, 0, 0, null, null, null, null, productTag, 0, null, null, null, null, str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, new InAppComm(string2, str, (description == null || (text = description.getText()) == null) ? "" : text, iacAlertSheet.getLocation().toString(), str2, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554561, -1, -1, -1, -1, -1, 16383, null);
    }
}
