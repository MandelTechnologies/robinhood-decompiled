package com.robinhood.android.generic.table;

import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import com.robinhood.models.serverdriven.experimental.api.Markdown;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PriceChangeDefaultValue;
import com.robinhood.models.serverdriven.experimental.api.RenderableText;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.TableColumnHeader;
import com.robinhood.models.serverdriven.experimental.api.TableDailyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableInstrumentName;
import com.robinhood.models.serverdriven.experimental.api.TableMonthlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableSharePriceItem;
import com.robinhood.models.serverdriven.experimental.api.TableSparklineItem;
import com.robinhood.models.serverdriven.experimental.api.TableThreeMonthPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableWeeklyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.TableYearlyPriceChangeItem;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getSduiComponentWidth", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getRenderableTextLength", "renderableText", "Lcom/robinhood/models/serverdriven/experimental/api/RenderableText;", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.SduiHelpersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SduiHelpers {
    public static final int getSduiComponentWidth(UIComponent<?> uIComponent) {
        String default_value;
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        if (uIComponent instanceof TableColumnHeader) {
            return ((TableColumnHeader) uIComponent).getTitle().length();
        }
        if (uIComponent instanceof TableInstrumentName) {
            TableInstrumentName tableInstrumentName = (TableInstrumentName) uIComponent;
            return Math.max(tableInstrumentName.getName().length(), tableInstrumentName.getSymbol().length());
        }
        if (uIComponent instanceof Text) {
            return getRenderableTextLength(((Text) uIComponent).getText());
        }
        if (uIComponent instanceof TableSparklineItem) {
            return 1;
        }
        if (!(uIComponent instanceof Container)) {
            if (uIComponent instanceof IconImage) {
                return 1;
            }
            if (uIComponent instanceof TableWeeklyPriceChangeItem) {
                PriceChangeDefaultValue default_value2 = ((TableWeeklyPriceChangeItem) uIComponent).getDefault_value();
                if (default_value2 == null || (value5 = default_value2.getValue()) == null) {
                    return 0;
                }
                return value5.length();
            }
            if (uIComponent instanceof TableYearlyPriceChangeItem) {
                PriceChangeDefaultValue default_value3 = ((TableYearlyPriceChangeItem) uIComponent).getDefault_value();
                if (default_value3 == null || (value4 = default_value3.getValue()) == null) {
                    return 0;
                }
                return value4.length();
            }
            if (uIComponent instanceof TableDailyPriceChangeItem) {
                PriceChangeDefaultValue default_value4 = ((TableDailyPriceChangeItem) uIComponent).getDefault_value();
                if (default_value4 == null || (value3 = default_value4.getValue()) == null) {
                    return 0;
                }
                return value3.length();
            }
            if (uIComponent instanceof TableMonthlyPriceChangeItem) {
                PriceChangeDefaultValue default_value5 = ((TableMonthlyPriceChangeItem) uIComponent).getDefault_value();
                if (default_value5 == null || (value2 = default_value5.getValue()) == null) {
                    return 0;
                }
                return value2.length();
            }
            if (uIComponent instanceof TableThreeMonthPriceChangeItem) {
                PriceChangeDefaultValue default_value6 = ((TableThreeMonthPriceChangeItem) uIComponent).getDefault_value();
                if (default_value6 == null || (value = default_value6.getValue()) == null) {
                    return 0;
                }
                return value.length();
            }
            if (!(uIComponent instanceof TableSharePriceItem) || (default_value = ((TableSharePriceItem) uIComponent).getDefault_value()) == null) {
                return 0;
            }
            return default_value.length();
        }
        Iterator it = ((Container) uIComponent).getContent().iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int sduiComponentWidth = getSduiComponentWidth((UIComponent) it.next());
            if (sduiComponentWidth > i) {
                i = sduiComponentWidth;
            }
        }
        return i;
    }

    public static final int getRenderableTextLength(RenderableText renderableText) {
        Intrinsics.checkNotNullParameter(renderableText, "renderableText");
        if (renderableText instanceof Markdown) {
            return ((Markdown) renderableText).getText().length();
        }
        if (renderableText instanceof PlainText) {
            return ((PlainText) renderableText).getText().length();
        }
        if (!(renderableText instanceof RichText)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((RichText) renderableText).getText().length();
    }
}
