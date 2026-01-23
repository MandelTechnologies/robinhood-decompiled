package com.robinhood.android.generic.table;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.UIComponentDto;
import rh_server_driven_ui.p531v1.WeightedItemDto;

/* compiled from: SduiDtoHelpers.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"getSduiComponentWidth", "", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "getRenderableTextLength", "renderableText", "Lrh_server_driven_ui/v1/RenderableTextDto$ConcreteDto;", "lib-generic-table_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.generic.table.SduiDtoHelpersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SduiDtoHelpers {
    public static final int getSduiComponentWidth(UIComponentDto.ConcreteDto concreteDto) {
        UIComponentDto.ConcreteDto concrete;
        UIComponentDto.ConcreteDto concrete2;
        UIComponentDto.ConcreteDto concrete3;
        RenderableTextDto.ConcreteDto concrete4;
        if (concreteDto instanceof UIComponentDto.ConcreteDto.TableColumnHeader) {
            return ((UIComponentDto.ConcreteDto.TableColumnHeader) concreteDto).getValue().getTitle().length();
        }
        if (concreteDto instanceof UIComponentDto.ConcreteDto.TableInstrumentName) {
            UIComponentDto.ConcreteDto.TableInstrumentName tableInstrumentName = (UIComponentDto.ConcreteDto.TableInstrumentName) concreteDto;
            return MathKt.roundToInt(Math.max(tableInstrumentName.getValue().getSymbol().length(), tableInstrumentName.getValue().getName().length() * 0.8666667f));
        }
        if (concreteDto instanceof UIComponentDto.ConcreteDto.Text) {
            RenderableTextDto text = ((UIComponentDto.ConcreteDto.Text) concreteDto).getValue().getText();
            if (text == null || (concrete4 = text.getConcrete()) == null) {
                return 0;
            }
            return getRenderableTextLength(concrete4);
        }
        if (!(concreteDto instanceof UIComponentDto.ConcreteDto.VStack)) {
            if (!(concreteDto instanceof UIComponentDto.ConcreteDto.HStack)) {
                if (concreteDto instanceof UIComponentDto.ConcreteDto.Decorator) {
                    UIComponentDto component = ((UIComponentDto.ConcreteDto.Decorator) concreteDto).getValue().getComponent();
                    if (component == null || (concrete = component.getConcrete()) == null) {
                        return 0;
                    }
                    return getSduiComponentWidth(concrete);
                }
                if (concreteDto instanceof UIComponentDto.ConcreteDto.Image) {
                    return 1;
                }
                if (concreteDto instanceof UIComponentDto.ConcreteDto.TextButton) {
                    return ((UIComponentDto.ConcreteDto.TextButton) concreteDto).getValue().getLabel().length();
                }
                return 0;
            }
            Iterator<T> it = ((UIComponentDto.ConcreteDto.HStack) concreteDto).getValue().getComponents().iterator();
            int sduiComponentWidth = 0;
            while (it.hasNext()) {
                UIComponentDto component2 = ((WeightedItemDto) it.next()).getComponent();
                sduiComponentWidth += (component2 == null || (concrete2 = component2.getConcrete()) == null) ? 0 : getSduiComponentWidth(concrete2);
            }
            return sduiComponentWidth;
        }
        Iterator<T> it2 = ((UIComponentDto.ConcreteDto.VStack) concreteDto).getValue().getComponents().iterator();
        int i = 0;
        while (it2.hasNext()) {
            UIComponentDto component3 = ((WeightedItemDto) it2.next()).getComponent();
            int sduiComponentWidth2 = (component3 == null || (concrete3 = component3.getConcrete()) == null) ? 0 : getSduiComponentWidth(concrete3);
            if (sduiComponentWidth2 > i) {
                i = sduiComponentWidth2;
            }
        }
        return i;
    }

    public static final int getRenderableTextLength(RenderableTextDto.ConcreteDto renderableText) {
        Intrinsics.checkNotNullParameter(renderableText, "renderableText");
        if (renderableText instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
            return ((RenderableTextDto.ConcreteDto.MarkdownText) renderableText).getValue().getText().length();
        }
        if (!(renderableText instanceof RenderableTextDto.ConcreteDto.PlainText)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((RenderableTextDto.ConcreteDto.PlainText) renderableText).getValue().getText().length();
    }
}
