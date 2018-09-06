/*******************************************************************************
 * Copyright (c) 2018 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.phoebus.ui.docking;

import org.phoebus.ui.javafx.ImageCache;

import javafx.scene.control.MenuItem;

/** Menu item to lock {@link DockPane}
 *  @author Kay Kasemir
 */
@SuppressWarnings("nls")
public class LockMenuItem extends MenuItem
{
    public LockMenuItem(final DockPane pane)
    {
        super("Lock Pane", ImageCache.getImageView(DockItem.class, "/icons/lock.png"));
        setOnAction(event -> pane.setFixed(true));
    }
}
