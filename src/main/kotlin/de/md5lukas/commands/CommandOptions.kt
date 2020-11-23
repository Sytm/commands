/*
 *     commands-kt - Library to define commands in a Kotlin-ish way
 *     Copyright (C) 2020 Lukas Planz <lukas.planz@web.de>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.md5lukas.commands

import org.bukkit.command.CommandSender

class CommandOptions @PublishedApi internal constructor(name: String) : SubCommandOptions(name) {

    var notFoundMessage: ((sender: CommandSender, fullCommand: String) -> Unit) = LambdaSingleton.notFoundMessage

    var helpListingsPerPage: Int = 10

    var helpFormatter: ((
        sender: CommandSender,
        name: String,
        fullCommand: String,
        description: String
    ) -> Unit) = LambdaSingleton.helpFormatter

    var shortHelpFormatter: ((
        sender: CommandSender,
        name: String,
        fullCommand: String,
        shortDescription: String
    ) -> Unit) = LambdaSingleton.shortHelpFormatter
}